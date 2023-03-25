package Sophia;

import javax.swing.*;

public class MenuBar extends JMenuBar {
    public MenuBar() {
        super();

        JMenu viewOption = new JMenu("View");
        add(viewOption);

        JMenuItem coursesOption = new JMenuItem("Courses");
        viewOption.add(coursesOption);
    }
}