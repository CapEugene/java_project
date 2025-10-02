package JavaForm;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        setTitle("Регистрация/авторизация");
        setSize(720, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MainPanel regAuthPanel = new MainPanel();
        regAuthPanel.setLayout(new BoxLayout(regAuthPanel, BoxLayout.Y_AXIS));
        getContentPane().add(regAuthPanel);

    }
}
