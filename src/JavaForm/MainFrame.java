package JavaForm;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        setTitle("Регистрация/авторизация");
        setSize(1280, 720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MainPanel authPanel = new MainPanel();
        MainPanel regPanel = new MainPanel();
        getContentPane().add(authPanel);
        getContentPane().add(regPanel);

    }
}
