package JavaForm;

import Auth.AppRegAuth;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AuthAction implements ActionListener {
    private final JTextField jTextLogin;
    private final JTextField jTextPassword;
    private final AppRegAuth appRegAuth;

    public AuthAction(AppRegAuth appRegAuth, JTextField jTextLogin, JTextField jTextPassword) {
        this.jTextLogin = jTextLogin;
        this.jTextPassword = jTextPassword;
        this.appRegAuth = appRegAuth;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String login = jTextLogin.getText();
        String password = jTextPassword.getText();

        if (appRegAuth.AuthUser(login, password) != null) {
            System.out.printf("Добро пожаловать, %s", login);
        }
        else {
            System.out.println("Данные не валидны! Пожалуйста, попробуйте ещё раз!");
        }
    }
}
