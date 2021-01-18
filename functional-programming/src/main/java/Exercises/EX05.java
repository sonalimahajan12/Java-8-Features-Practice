package Exercises;

import java.util.List;

public class EX05 {

    public static void main(String[] args) {

        List<Integer> numbers=List.of(1,2,3,4,5,6,7,8,9,10,11);
//        numbers.stream().map(nom->nom*nom).forEach(System.out::println);
            numbers.stream().filter(no->no%2!=0).map(no->no*no*no).forEach(System.out::println);
    }
}
