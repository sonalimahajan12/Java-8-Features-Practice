package programming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoiningStrings {
    public static void main(String[] args) {

        List<String> courses= List.of("Spring","AWS","MS","Spring Boot","API","Azure","Docker","Kubernetes");
        List<String> courses2= List.of("Spring","AWS","MS","Spring Boot","API","Azure","Docker","Kubernetes");


        System.out.println(courses.stream().collect(Collectors.joining(",")));

        System.out.println("spring".split(""));

        System.out.println(courses.stream().map(cs->cs.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList()));

        System.out.println(courses.stream().flatMap(cs->courses2.stream().map(course2->List.of(cs,course2))).collect(Collectors.toList()));

        System.out.println(courses.stream().flatMap(cs->courses2.stream().map(course2->List.of(cs,course2))).filter(list->list.get(0).equals(list.get(1))).collect(Collectors.toList()));

        System.out.println(courses.stream().flatMap(cs->courses2.stream().filter(course2->course2.length()==cs.length()).map(course2->List.of(cs,course2))).collect(Collectors.toList()));
    }
}
