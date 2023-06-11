//Write a recursive function that takes a list of numbers as an input and return product of all numbers in list

import java.util.ArrayList;
import java.util.List;

public class ProdInList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);
        numbers.add(8);

        int result = calculateProduct(numbers);
        System.out.println("Product: " + result);
    }

    public static int calculateProduct(List<Integer> numbers) {
        return calculateProductHelper(numbers, 0);
    }

    private static int calculateProductHelper(List<Integer> numbers, int index) {
        if (index == numbers.size()) {
            return 1; // Base case: return 1 when we reach the end of the list
        } else {
            int currentNumber = numbers.get(index);
            int subProduct = calculateProductHelper(numbers, index + 1);
            return currentNumber * subProduct;
        }
    }
}
