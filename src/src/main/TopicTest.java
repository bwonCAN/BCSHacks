package main;

import java.util.ArrayList;
import java.util.List;

public abstract class TopicTest {

    protected static Course cpsc110;
    protected static Course cpsc121;
    protected static Course cpsc203;
    protected static Course dsci100;
    protected static Course dsci310;
    protected static Course dsci320;
    protected static Course math100;
    protected static Course math101;
    protected static Course cpsc210;
    protected static Course cpsc221;
    protected static Course cpsc213;
    protected static Course cpsc310;
    protected static Course cpsc410;
    protected static Course cpsc320;
    protected static Course cpsc420;

    protected List<Course> courseList;


    public TopicTest() {
        courseList = new ArrayList<Course>();
    }

    public void createCourses() {
        cpsc110 = new Course("CPSC 110", "Computation, Programs, and Programming",
                "Fundamental program and computation structures. Introductory programming skills. " +
                        "Computation as a tool for information processing, simulation and modeling, and interacting " +
                        "with the world. [3-3-0]\n");
        cpsc121 = new Course("CPSC 121", "Models of Computation", "Physical and mathematical " +
                "structures of computation. Boolean algebra and combinations logic circuits; proof techniques; " +
                "functions and sequential circuits; sets and relations; finite state machines; sequential instruction " +
                "execution.");
        cpsc203 = new Course("CPSC 203", "Programming, Problem Solving, and Algorithms",
                "Analysis of increasingly complex algorithmic problems, using a modern programming " +
                        "language and a variety of approaches. Problem decomposition and abstraction guide " +
                        "explorations of topics from applied algorithms, for example Voronoi Diagrams, Markov " +
                        "Chains, Bin Packing, and Graph Search. Not for students with credit for, or currently " +
                        "enrolled in, CPSC 210 or CPEN 221.");

        dsci100 = new Course("DSCI 100", "Introduction to Data Science", "Use of data science tools to summarize, " +
                "visualize, and analyze data. Sensible workflows and clear interpretations are emphasized.");
        dsci310 = new Course("DSCI 310", "Reproducible and Trustworthy Workflows for Data Science", "Data science" +
                " methods to automate the running and testing of code and analytic reports, manage data analysis " +
                "software dependencies, package and deploy software for data analysis, and collaborate with others " +
                "using version control.");
        dsci320 = new Course("DSCI 320", "Visualization for Data Science", "Analysis, design, and " +
                "implementation of static and interactive visual representations; visualization literacy; " +
                "data communication; exploratory Data Analysis; application of theoretical principles " +
                "to visualization development.");
        math100 = new Course("MATH 100", "Differential Calculus with Applications", "Derivatives of " +
                "elementary functions. Applications and modelling: graphing, optimization.");
        math101 = new Course("MATH 101", "Integral Calculus with Applications", "The definite" +
                " integral, integration techniques, applications, modelling, infinite series.");
        cpsc210 = new Course("CPSC 210", "Software Construction", "Design, development, and " +
                "analysis of robust software components. Topics such as software design, computational models, " +
                "data structures, debugging, and testing.");
        cpsc213 = new Course("CPSC 213", "Introduction to Computer Systems",
                "Software architecture, operating systems, and I/O architectures. Relationships between " +
                        "application software, operating systems, and computing hardware; critical sections, " +
                        "deadlock avoidance, and performance; principles and operation of disks and networks." );
        cpsc221 = new Course("CPSC 221", " Basic Algorithms and Data Structures",
                "Design and analysis of basic algorithms and data structures; algorithm analysis methods," +
                        " searching and sorting algorithms, basic data structures, graphs and concurrency." );
        cpsc310 = new Course ("CPSC 310", "Introduction to Software Engineering",
                "Specification, design, validation, evolution and construction of modern software systems, " +
                        "within the context of socially and professionally relevant domains such as ethics, " +
                        "intellectual property, and information security. ");
        cpsc410 = new Course ("CPSC 410", "Advanced Software Engineering",
                "Specification, design, construction and validation of multi-version software systems.");





    }

    public List<Course> getCourseList() {
        return courseList;
    }

}
