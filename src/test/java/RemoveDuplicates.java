import java.util.*;

    public class RemoveDuplicates {

     /*
    Write a Java program that removes repetitive elements from a list.

    List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 5, 1, 6, 4);
    [1, 2, 3, 4, 5, 6]

    */

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 5, 1, 6, 4);

        //Remove repetitive elements
        Set<Integer> uniqueNumbers = new LinkedHashSet<>(numbers);

        // Print the result by converting it to a list
        List<Integer> result = new ArrayList<>(uniqueNumbers);
        System.out.println(result);
    }
}
