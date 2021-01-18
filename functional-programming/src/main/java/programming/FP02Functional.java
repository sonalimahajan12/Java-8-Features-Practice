package programming;

import java.util.List;

public class FP02Functional {

    public static void main(String[] args) {

        List<Integer> numbers=List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println("Sum Is: ");
       int sum=addListFunctional(numbers);
        System.out.println(sum);
    }

    private static int addListFunctional(List<Integer> numbers)
    {
//        return numbers.stream().reduce(0,FP02Functional::sum);
//        return numbers.stream().reduce(0,(x,y)->x+y);
        return numbers.stream().reduce(0,Integer::sum);

    }

//    private static Integer sum(Integer aggregate, Integer nextno) {
//        System.out.println(aggregate+ " " +nextno);
//        return aggregate+nextno;
//    }
}
