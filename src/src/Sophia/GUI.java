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
    private JPanel panel;

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
        setVisible(true);
    }

    private void createMenuBar() {
        menuBar = new MenuBar();
        add(menuBar, BorderLayout.NORTH);

    }

    public void coursesAsButtons() {
        panel = new JPanel();
        panel.setLayout(new GridLayout(15,2));
        panel.setSize(300,500);

        dataScience = new DataScience();
        System.out.println(dataScience.getCourseList());

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
            panel.add(button);
            panel.add(courseDescription);
        }

        add(panel, BorderLayout.CENTER);
    }
}
