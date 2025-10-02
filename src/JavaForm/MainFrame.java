package JavaForm;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        setTitle("Регистрация/авторизация");
        setSize(1280, 720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MainPanel regAuthPanel = new MainPanel();
        getContentPane().add(regAuthPanel);

    }
}
