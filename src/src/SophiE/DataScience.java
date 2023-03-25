package SophiE;

import main.Course;
import main.TopicTest;

import java.util.ArrayList;
import java.util.List;


public class DataScience extends TopicTest {
    private List<Course> courseList;


    public DataScience() {
        courseList = new ArrayList<>();

        courseList.add(cpsc110);

    }

    @Override
    public List<Course> getCourseList() {
        return courseList;
    }
}
