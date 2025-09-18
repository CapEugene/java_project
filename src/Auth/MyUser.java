package Auth;

public class MyUser {
    private final String login;
    private final String password;

    public MyUser(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
