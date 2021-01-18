package programming;

import java.util.List;
import java.util.stream.Collectors;

public class Collect_to_list {
    public static void main(String[] args) {

        List<Integer> numbers=List.of(1,3,5);
        List<Integer> doubledNumbers=doubleList(numbers);
        System.out.println(doubledNumbers);
    }

    private static List<Integer> doubleList(List<Integer> numbers) {
        return numbers.stream().map(x->x*x).collect(Collectors.toList());
    }
}
