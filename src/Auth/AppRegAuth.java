package Auth;

public class AppRegAuth {
    UserDaoImpl userDao = new UserDaoImpl();

    public MyUser AuthUser(String login, String password) {
//        return db.CheckUserData(login, password);
        return userDao.checkUser(login, password);
    }

    public MyUser RegisterUser(String login, String password) {
//        if (db.FindUserByLogin(login) != null) { return null; }
//        return db.AddUser(new MyUser(login, password));
        if (userDao.findByLogin(login) != null) { return null; }
        if (login.isEmpty() && password.isEmpty()) { return null; }
        MyUser user = new MyUser(login, password);
        userDao.save(user);
        return user;
    }
}