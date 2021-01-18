package programming;

import java.util.List;

public class FP01Structured {

    public static void main(String[] args) {

        List<Integer> numbers=List.of(1,3,4,5,6,11,2,7);

        printallnumbersstructured(numbers);
        printevennumbersStructured(numbers);
    }

    private static void printevennumbersStructured(List<Integer> numbers) {

        for(int no:numbers)
        {
            if(no%2==0)
            {
                System.out.println("Even no is " +no);
            }
            else
            {
                System.out.println("Odd no is " +no);
            }
        }
    }

    private static void printallnumbersstructured(List<Integer> numbers) {

        for(int no:numbers)
            System.out.println(no);
    }

}
