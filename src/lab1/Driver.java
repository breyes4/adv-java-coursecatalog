package lab1;

import lab2.CourseLike;

public class Driver {
    public static void main(String[] args) {
        Course course = new AdvancedJavaCourse("3", "3");
        Course course2 = new IntroJavaCourse("3", "3");
        Course course3 = new IntroToProgrammingCourse("3", "3");

        System.out.println(course);
        System.out.println(course2);
        System.out.println(course3);
    }

}
