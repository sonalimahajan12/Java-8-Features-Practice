package programming;

import java.util.List;

public class FP01Functional {

    public static void main(String[] args)
    {
//        printallnumbersfunctional(List.of(1,2,3,4,5,6,7,8));
        System.out.println("Even Numbers: ");
        printEvennumbersfunctional(List.<Integer>of(12,5,3,4,88,11,22,34));

    }

    private static void printEvennumbersfunctional(List<Integer> numbers) {

//            numbers.stream().filter(FP01Functional::isEven).forEach(System.out::println);
        numbers.stream().filter(no->no%2==0).forEach(System.out::println);

    }

//    private static boolean isEven(int no) {
//
//        return no%2==0;
//    }

//    private static <E> void printallnumbersfunctional(List<Integer> numbers) {
//
////        numbers.stream().forEach(FP01Functional::print); //Method Reference
////        numbers.stream().forEach(System.out::println);
//
//    }

//    private static <E> void print(E no) {
//        System.out.println(no);
//    }


}
