package Sophia;

import SophiE.DataScience;
import main.Course;
import main.TopicTest;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {
    private static final int WIDTH = 500;
    private static final int HEIGHT = 500;

    private JMenuBar menuBar;
    private TopicTest dataScience;
    private TopicTest algorithms;
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

        dataScience = new DataScience();
        algorithms = new Algorithms();

        createMenuBar();
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

    private void menuResponse() {
//        if (menuBar.isSelected()) {
//            coursesAsButtons(algorithms);
//        }
//        coursesAsButtons(algorithms);
    }

    public void coursesAsButtons(TopicTest topic) {
        panel = new JPanel();
        dataScience = new DataScience();
        System.out.println(topic.getCourseList());

        for (Course course : topic.getCourseList()) {
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
            panel.setLayout(new GridLayout(topic.getCourseList().size(),3, 2, 2));
            panel.setSize(300,300);
            panel.add(button);
            panel.add(jTextField);
            panel.setVisible(true);
        }

        add(panel, BorderLayout.CENTER);

    }
}
