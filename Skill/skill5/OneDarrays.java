package stask5;

public class OneDarrays {
	public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] numbers = {10, 20, 30, 40, 50};

        // Access and print elements using a for loop
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Calculate the sum of all elements in the array
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of array elements: " + sum);

        // Modify an element in the array
        numbers[2] = 35;
        System.out.println("Updated element at index 2: " + numbers[2]);
    }

}
