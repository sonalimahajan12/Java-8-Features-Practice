package Exercises;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class FilesEx1 {
    public static void main(String[] args) throws IOException {

//        Files.lines(Paths.get("C:\\Users\\hadah\\IdeaProjects\\functional-programming\\src\\file.txt"))
//                .map(lin->lin.split(" ")).flatMap(Arrays::stream).distinct().sorted()
//                .forEach(System.out::println);

        Files.list(Paths.get(".")).filter(Files::isDirectory).forEach(System.out::println);

    }
}
