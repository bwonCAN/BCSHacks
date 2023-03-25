package Sophia;

import SophiE.DataScience;
import main.Course;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {
    private static final int WIDTH = 500;
    private static final int HEIGHT = 500;

    private JMenuBar menuBar;
    private DataScience dataScience;
    private JPanel panel;
    private JPanel fieldsPanel;

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
        menuBar = new JMenuBar();
        add(menuBar, BorderLayout.NORTH);

        JMenu viewOption = new JMenu("View");
        add(viewOption);

        JMenuItem coursesOption = new JMenuItem("Fields");
        coursesOption.addActionListener(e -> displayFields());
        viewOption.add(coursesOption);
    }

    private void displayFields() {
        fieldsPanel = new JPanel();
        fieldsPanel.setLayout(new GridLayout(3,1));
        fieldsPanel.add(new JButton("Data Science"));
        fieldsPanel.add(new JButton("Algorithms"));
        fieldsPanel.add(new JButton("Software Engineering"));
    }

    public void coursesAsButtons() {
        panel = new JPanel();
        dataScience = new DataScience();
        System.out.println(dataScience.getCourseList());

        for (Course course : dataScience.getCourseList()) {
            JButton button = new JButton(course.getName());
            //Label courseDescription =  new Label();
            JTextArea jTextField= new JTextArea();
            button.setActionCommand("courseBtn");
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    //courseDescription.setText(course.getDescription());
                    jTextField.setText(course.getDescription());
                }
            });
            jTextField.setLineWrap(true);
            JScrollPane scrollPane = new JScrollPane(jTextField);
            panel.add(scrollPane);
            add(scrollPane);
            scrollPane.createVerticalScrollBar();
            ((JPanel) getContentPane()).setBorder(new EmptyBorder(7, 13, 13, 13));
            panel.setLayout(new GridLayout(dataScience.getCourseList().size(),3, 2, 2));
            panel.setSize(300,300);
            panel.add(button);
            panel.add(jTextField);
            panel.setVisible(true);
        }

        add(panel, BorderLayout.CENTER);

    }
}
