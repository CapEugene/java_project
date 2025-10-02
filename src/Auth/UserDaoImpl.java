package Auth;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.*;

public class UserDaoImpl implements UserDao<MyUser> {
    private final String filePath = "users.json";
//    private List<MyUser> users = new ArrayList<>();
    private final Gson gson = new Gson();
    private final DBWork db = new DBWork();
    public UserDaoImpl() {
        loadFromFile();
    }

    private void loadFromFile() {
        try (FileReader reader = new FileReader(filePath)) {
            Type listType = new TypeToken<List<MyUser>>() {}.getType();
            List<MyUser> loadedUsers = gson.fromJson(reader, listType);
            if (loadedUsers != null) {
                db.setUsers(loadedUsers);
            }
        } catch (IOException e) {
            db.setUsers(new ArrayList<MyUser>());
        }
    }

    private void saveToFile() {
        try (FileWriter writer = new FileWriter(filePath)) {
            gson.toJson(db.getUsers(), writer);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public Optional<MyUser> get(long id) {
        if (id >= 0 && id < db.getUsers().size()) {
            return Optional.of(db.getUsers().get((int) id));
        }
        return Optional.empty();
    }

    @Override
    public List<MyUser> getAll() {
        return db.getUsers();
    }

    @Override
    public void save(MyUser user) {
        db.AddUser(user);
        saveToFile();
    }

    @Override
    public void update(MyUser user, String[] params) {
    }

    @Override
    public void delete(MyUser user) {
        List<MyUser> users = db.getUsers();
        users.removeIf(u -> u.getLogin().equals(user.getLogin()));
        db.setUsers(users);
        saveToFile();
    }

    public MyUser findByLogin(String login) {
        if (db.FindUserByLogin(login) != null) { return db.FindUserByLogin(login); }
        return null;
    }

    public MyUser checkUser(String login, String password) {
        if (db.CheckUserData(login, password) != null) return db.CheckUserData(login, password);
        return null;
    }
}
