import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class C12_ArrayCollectionExample {
    public static void main(String[] args) {

        // Step 1: Defining the sample array.
        int[] numbers = {12, 3, 5, 8, 9, 14, 7, 2, 11, 6};

        // We arrange the array in ascending order.
        Arrays.sort(numbers);

        // Step 2: We create a HashMap to store groups for even and odd numbers.
        Map<String, C11_GroupInfo> groupMap = new HashMap<>();
        groupMap.put("Çift", new C11_GroupInfo());
        groupMap.put("Tek", new C11_GroupInfo());

        // Step 3: We check each number in the array and add it to the relevant group.
        for (int num : numbers) {
            if (num % 2 == 0) {
                groupMap.get("Çift").addNumber(num);
            } else {
                groupMap.get("Tek").addNumber(num);
            }
        }

        // Step 4: We calculate the average of each group.
        groupMap.get("Çift").calculateAverage();
        groupMap.get("Tek").calculateAverage();

        // We print the results on the screen.
        System.out.println("Sıralı Dizi: " + Arrays.toString(numbers));
        System.out.println("Çift Sayılar -> " + groupMap.get("Çift"));
        System.out.println("Tek Sayılar  -> " + groupMap.get("Tek"));
    }
}
