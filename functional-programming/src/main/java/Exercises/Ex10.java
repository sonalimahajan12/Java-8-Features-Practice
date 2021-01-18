package Exercises;

import java.util.List;
import java.util.stream.Collectors;

public class Ex10 {

    public static void main(String[] args) {

        List<Integer> numbers=List.of(1,2,3,4,5,6);
        List<Integer> evennumbers=EvenList(numbers);
        System.out.println(evennumbers);
    }

    private static List<Integer> EvenList(List<Integer> numbers) {
        return numbers.stream().filter(x->x%2==0).collect(Collectors.toList());
    }
}
