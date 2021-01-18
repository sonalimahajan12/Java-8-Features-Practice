package programming;

import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.Files;

public class FilesEx {

    public static void main(String[] args) throws IOException {

        Files.lines(Paths.get("C:\\Users\\hadah\\IdeaProjects\\functional-programming\\src\\file.txt")).forEach(System.out::println);
    }
}
