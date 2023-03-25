package Sophia;

import SophiE.DataScience;
import main.Course;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {
    private static final int WIDTH = 1000;
    private static final int HEIGHT = 800;

    private JMenuBar menuBar;
    private DataScience dataScience;

    public GUI() {
        initializeGraphics();
    }

    private void initializeGraphics() {
        setLocationRelativeTo(null);
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        createMenuBar();
        coursesAsButtons();
    }

    private void createMenuBar() {
        menuBar = new MenuBar();
        add(menuBar, BorderLayout.NORTH);
        setVisible(true);
    }

    public void coursesAsButtons() {
        Panel panel = new Panel();
        for (Course course : dataScience.getCourseList()) {
            JButton button = new JButton(course.getName());
            Label courseDescription =  new Label();
            button.setActionCommand("courseBtn");
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    courseDescription.setText(course.getDescription());
                }
            });
            panel.add(courseDescription);
            panel.add(button);

        }
    }
}
