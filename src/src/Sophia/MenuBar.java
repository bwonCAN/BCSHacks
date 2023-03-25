package Sophia;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuBar {
    private JMenuBar menuBar;

    public MenuBar() {
        menuBar = new JMenuBar();

        JMenu viewOption = new JMenu("View");
        menuBar.add(jobTrackOption);

        JMenuItem coursesOption = new JMenuItem("Courses");
        viewOption.add(coursesOption);
    }
}
