package JavaForm;

import Auth.AppRegAuth;

import javax.swing.*;

public class MainPanel extends JPanel {
    private JTextField jTextLogin;
    private JTextField jTextPassword;
    private AppRegAuth appRegAuth;

    public MainPanel() {
        appRegAuth = new AppRegAuth();

        JButton loginButton = new JButton("Login");
        JButton registerButton = new JButton("Register");
        jTextLogin = new JTextField(50);
        jTextPassword = new JTextField(50);

        add(jTextLogin);
        add(jTextPassword);

        add(loginButton);
        add(registerButton);

        loginButton.setName("loginButton");
        registerButton.setName("registerButton");

        RegAction register = new RegAction(appRegAuth, jTextLogin, jTextPassword);
        registerButton.addActionListener(register);

        AuthAction auth = new AuthAction(appRegAuth, jTextLogin, jTextPassword);
        loginButton.addActionListener(auth);
    }
}
