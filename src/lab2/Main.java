package lab2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<CourseLike> courses = new ArrayList<CourseLike>();
        courses.add(new AdvancedJavaCourse("Ad", "3"));
        courses.add(new IntroJavaCourse("Ad", "3"));
        courses.add(new IntroToProgrammingCourse("Ad", "3"));

        for (CourseLike c : courses) {
            System.out.println(c);
            writeItOut(c);
        }
    }


    public static void writeItOut(CourseLike cl) {
        System.out.println(cl.getCourseName() + " was here");
        System.out.printf("%s was here\n", cl.getCourseName());
    }
}
