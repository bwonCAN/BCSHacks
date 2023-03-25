package SophiE;

import main.TopicTest;


public class DataScience extends TopicTest {
    public DataScience() {
        super();
        addCourses();
        name = "Data Science";
    }

    private void addCourses() {
        courseList.add(cpsc110);
        courseList.add(dsci100);
        courseList.add(dsci310);
        courseList.add(dsci320);
        courseList.add(math100);
        courseList.add(math101);
    }

}
