package JavaForm;

import Auth.AppRegAuth;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegAction implements ActionListener {
    private final JTextField jTextLogin;
    private final JTextField jTextPassword;
    private final AppRegAuth appRegAuth;

    public RegAction(AppRegAuth appRegAuth, JTextField jTextLogin, JTextField jTextPassword) {
        this.jTextLogin = jTextLogin;
        this.jTextPassword = jTextPassword;
        this.appRegAuth = appRegAuth;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String login = jTextLogin.getText();
        String password = jTextPassword.getText();

        if (appRegAuth.RegisterUser(login, password) != null) {
            System.out.println("Пользователь успешно зарегистрирован!");
        }
        else {
            System.out.println("Данный пользователь уже существует!");
        }
    }
}
