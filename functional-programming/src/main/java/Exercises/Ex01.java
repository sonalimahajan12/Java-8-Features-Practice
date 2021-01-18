package Exercises;

import java.util.List;

public class Ex01 {

    public static void main(String[] args) {

        List<Integer> numbers=List.of(88, 22, 13, 26, 33, 21, 98, 100, 03);
        System.out.println("Odd Nos are ");
        numbers.stream().filter(no->no%2!=0).forEach(System.out::println);

    }
}
