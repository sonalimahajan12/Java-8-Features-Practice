package Exercises;

import java.util.List;
import java.util.stream.Collectors;

public class Ex11 {

    public static void main(String[] args) {

        List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes");
        List<Integer> LengthOfCourses=LengthCourses(courses);
        System.out.println(LengthOfCourses);
    }

    private static List<Integer> LengthCourses(List<String> courses) {
        return courses.stream().map(course->course.length()).collect(Collectors.toList());
    }
}
