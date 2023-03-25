package main;

import java.util.List;

public abstract class TopicTest {

    protected static Course cpsc110;
    protected static Course cpsc121;
    protected static Course cpsc203;


    public TopicTest() {

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
    }

    public abstract List<Course> getCourseList();

}
