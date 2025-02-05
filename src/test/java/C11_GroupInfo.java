import java.util.*;

public class C11_GroupInfo {
    /*
    Write a Java program that processes a given integer array in the following steps:

Arrange the array in ascending order.
Divide the elements of the array into two groups: even and odd numbers.
Calculate the sum and average of the numbers in each group.
Store the information of each group (elements, sum, average) in a HashMap structure.
For example,
Given array
int[] numbers = {12, 3, 5, 8, 9, 14, 7, 2, 11, 6};

Expected output (e.g. ranking result and calculations):
Sequential Sequence: [2, 3, 5, 6, 7, 8, 9, 11, 12, 14]
Even Numbers -> Numbers: [2, 6, 8, 12, 14], Total: 42, Average: 8.4
Odd Numbers -> Numbers: [3, 5, 7, 9, 11], Total: 35, Average: 7.0

     */



    // Our auxiliary class for keeping group information.

        private List<Integer> numbers;
        private int sum;
        private double average;

        public C11_GroupInfo(){
            numbers = new ArrayList<>();
            sum = 0;
            average = 0.0;
        }

        // We add a number and update the sum.
        public void addNumber(int num) {
            numbers.add(num);
            sum += num;
        }

        // Average calculation.
        public void calculateAverage() {
            if (!numbers.isEmpty()) {
                average = (double) sum / numbers.size();
            }
        }

        public List<Integer> getNumbers() {
            return numbers;
        }

        public int getSum() {
            return sum;
        }

        public double getAverage() {
            return average;
        }

        @Override
        public String toString() {
            return "Sayılar: " + numbers + ", Toplam: " + sum + ", Ortalama: " + average;
        }
    }


