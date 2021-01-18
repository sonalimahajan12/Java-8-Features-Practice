package Exercises;

import java.util.List;

public class Ex07 {

    public static void main(String[] args) {

        List<Integer> numbers=List.of(12,9,13,4,6,2,4,12,15);
        int sums=numbers.stream().map(x->x*x).reduce(0,Integer::sum);
        System.out.println(sums);
    }
}
