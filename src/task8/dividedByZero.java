package task8;

import java.util.Scanner;

public class dividedByZero {

    public static void main(String arg[]) {
        try {
            int firstNumber;
            int secondNumber;
            int result;

            Scanner scanner = new Scanner(System.in);
            System.out.print("First number: ");
            firstNumber = scanner.nextInt();
            System.out.print("Second number: ");
            secondNumber = scanner.nextInt();

            result = firstNumber / secondNumber;

            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Error: " + e);
        }
    }

}