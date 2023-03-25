package Sophia;

import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {
    private static final int WIDTH = 1000;
    private static final int HEIGHT = 800;

    private JMenuBar menuBar;

    public GUI() {
        initializeGraphics();
    }

    private void initializeGraphics() {
        setLocationRelativeTo(null);
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        createMenuBar();
    }

    private void createMenuBar() {
        menuBar = new MenuBar();
        add(menuBar, BorderLayout.NORTH);
        setVisible(true);
    }
}
