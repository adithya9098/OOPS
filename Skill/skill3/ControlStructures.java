package stask3;

import java.util.Scanner;

public class ControlStructures {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
// Example of if-else control structure
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // Example of switch control structure
        System.out.print("Enter a day number (1-7): ");
        int day = scanner.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number.");
        }

        // Example of for loop
        System.out.println("For loop: Numbers from 1 to 5");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Example of while loop
        System.out.println("While loop: Counting down from 5");
        int count = 5;
        while (count > 0) {
            System.out.print(count + " ");
            count--;
        }
        System.out.println();

        // Example of do-while loop
        System.out.println("Do-while loop: Counting up from 1 to 5");
        int num = 1;
        do {
            System.out.print(num + " ");
            num++;
        } while (num <= 5);
        System.out.println();
        scanner.close();
    }

}
