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
    protected static Course cpsc322;
    protected static Course cpsc340;
    protected static Course cpsc330;
    protected static Course cpsc425;
    protected static Course cpsc422;
    protected static Course cpsc440;

    protected List<Course> courseList;

    public TopicTest() {
        courseList = new ArrayList<Course>();
        createCourses();
    }

    public void createCourses() {
        cpsc110 = new Course("CPSC 110", "Computation, Programs, and Programming",
                "Fundamental program and computation structures. Introductory programming skills. " +
                        "Computation as a tool for information processing, simulation and modeling, and interacting " +
                        "with the world. [3-3-0]\n");
        cpsc121 = new Course("CPSC 121", "Models of Computation", "Physical and mathematical " +
                "structures of computation. Boolean algebra and combinations logic circuits; proof techniques; " +
                "functions and sequential circuits; sets and relations; finite state machines; sequential instruction" +
                " execution.");
        cpsc203 = new Course("CPSC 203", "Programming, Problem Solving, and Algorithms",
                "Analysis of increasingly complex algorithmic problems, using a modern programming " +
                        "language and a variety of approaches. Problem decomposition and abstraction guide " +
                        "explorations of topics from applied algorithms, for example Voronoi Diagrams, Markov " +
                        "Chains, Bin Packing, and Graph Search. Not for students with credit for, or currently " +
                        "enrolled in, CPSC 210 or CPEN 221.");

        dsci100 = new Course("DSCI 100", "Introduction to Data Science", "Use of data science " +
                "tools to summarize,  visualize, and analyze data. Sensible workflows and clear interpretations are " +
                "emphasized.");
        dsci310 = new Course("DSCI 310", "Reproducible and Trustworthy Workflows for Data Science",
                "Data science" +
                " methods to automate the running and testing of code and analytic reports, manage data analysis " +
                "software dependencies, package and deploy software for data analysis, and collaborate with others " +
                "using version control.");
        dsci320 = new Course("DSCI 320", "Visualization for Data Science", "Analysis, design, and" +
                " implementation of static and interactive visual representations; visualization literacy; " +
                "data communication; exploratory Data Analysis; application of theoretical principles " +
                "to visualization development.");
        math100 = new Course("MATH 100", "Differential Calculus with Applications", "Derivatives "+
                "of elementary functions. Applications and modelling: graphing, optimization.");
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
                "Specification, design, validation, evolution and construction of modern software systems," +
                        " within the context of socially and professionally relevant domains such as ethics, " +
                        "intellectual property, and information security. ");
        cpsc410 = new Course ("CPSC 410", "Advanced Software Engineering",
                "Specification, design, construction and validation of multi-version software systems.");
        cpsc320 = new Course("CPSC 320", "Intermediate Algorithm Design and Analysis",
                "Systematic study of basic concepts and techniques in the design and analysis of " +
                        "algorithms, illustrated from various problem areas.");
        cpsc420 = new Course("CPSC 420", "Advanced Algorithms Design and Analysis", "The study " +
                "of advanced topics in the design and analysis of algorithms and associated data structures. ");

        cpsc322 = new Course("CPSC 322", "Advanced Algorithms Design and Analysis", "The study " +
                "of advanced topics in the design and analysis of algorithms and associated data structures. ");

        cpsc340 = new Course("CPSC 340", "Machine Learning and Data Mining",  "Models of " +
                "algorithms" +" for dimensionality reduction, nonlinear regression, classification, clustering and " +
                "unsupervised " + "learning; applications to computer graphics, computer games, bio-informatics, " +
                "information retrieval," + " e-commerce, databases, computer vision and artificial intelligence");

        cpsc330 = new Course("CPSC 330", "Applied Machine Learning", "Application of machine " +
                "learning tools, with an emphasis on solving practical problems. Data cleaning, feature extraction, " +
                "supervised and unsupervised machine learning, reproducible workflows, and communicating results.");

        cpsc425 = new Course("CPSC 425", "Computer Vision", "Introduction to the processing and" +
                " interpretation of images. Image sensing, sampling, and filtering. Algorithms for colour analysis," +
                " texture description, stereo imaging, motion interpretation, 3D shape recovery, and recognition.");

        cpsc422 = new Course("CPSC 422", "Intelligent Systems", "Principles and techniques " +
                "underlying the design, implementation and evaluation of intelligent computational systems. " +
                "Applications of artificial intelligence to natural language understanding, image understanding and" +
                " computer-based expert and advisor systems. Advanced symbolic programming methodology.");

        cpsc440 = new Course("CPSC 440", "Advanced Methods for Human Computer Interaction",
                "Design and evaluation methodologies and theories; formal models of the user including " +
                        "visual, motor, and information processing; advanced evaluation methods including laboratory " +
                        "experiments and field studies; HCI research frontiers.");

    }

    public List<Course> getCourseList() {
        return courseList;
    }

}
