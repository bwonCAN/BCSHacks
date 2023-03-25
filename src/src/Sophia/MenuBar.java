package Sophia;

import javax.swing.*;

public class MenuBar {
    private JMenuBar menuBar;

    public MenuBar() {
        menuBar = new JMenuBar();

        JMenu viewOption = new JMenu("View");
        menuBar.add(viewOption);

        JMenuItem coursesOption = new JMenuItem("Courses");
        viewOption.add(coursesOption);
    }
}