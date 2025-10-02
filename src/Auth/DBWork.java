package Auth;

import java.util.ArrayList;
import java.util.List;

public class DBWork {
    List<MyUser> users = new ArrayList<>();

    public MyUser FindUserByLogin(String login) {
        for (MyUser user : users) {
            if (user.getLogin().equals(login)) {
                return user;
            }
        }

        return null;
    }

    public void AddUser(MyUser user) {
        users.add(user);
//        return user;
//        System.out.printf(user.getLogin(), user.getPassword());
//        System.out.println(users);
    }

    public MyUser CheckUserData(String login, String password) {
        for (MyUser user : users) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                return user;
            }
//            System.out.printf(user.getLogin(), user.getPassword());
//            System.out.println("Hello!");
        }
        return null;
    }

    public List<MyUser> getUsers() {
        return users;
    }

    public void setUsers(List<MyUser> users) {
        this.users = users;
    }
}
