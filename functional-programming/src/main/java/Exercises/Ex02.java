package Exercises;

import java.util.List;

public class Ex02 {

    public static void main(String[] args) {

        List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes");
        courses.stream().forEach(System.out::println);
    }
}
