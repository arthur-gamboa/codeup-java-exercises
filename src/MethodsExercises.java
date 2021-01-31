import com.sun.jdi.event.MethodEntryEvent;
import com.sun.jdi.event.MethodExitEvent;

import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

//        MethodsExercises.addition(2, 2);
//        MethodsExercises.subtraction(3, 3);
//        MethodsExercises.multiplication(4, 4);
//        MethodsExercises.division(49, 7);
//        MethodsExercises.modulus(10, 7);
//        MethodsExercises.getInteger(1, 10);

        MethodsExercises.getFactorial(sc);

    }

    public static void addition(int num1, int num2) {
        int add = num1 + num2;
        System.out.println("Addition: " + add);
    }

    public static void subtraction(int num1, int num2) {
        int subtract = num1 - num2;
        System.out.println("Subtraction: " + subtract);
    }

    public static void multiplication(int num1, int num2) {
        int multiply = num1 * num2;
        System.out.println("Multiplication: " + multiply);
    }


//    // multiply by adding
//    public static int multiAdd(int base, int multi) {
//        int total = 0;
//        for (int multi = 0; i < multi; i++) {
//            total += base;
//        }
//        return total;
//    }

    public static void division(int num1, int num2) {
        int divide = num1 / num2;
        System.out.println("Division: " + divide);
    }

    public static void modulus(int num1, int num2) {
        int module = num1 % num2;
        System.out.println("Modulus: " + module);
    }

    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10.");
        int userInput = sc.nextInt();

        if (userInput < min || userInput > max) {
            System.out.println("Not valid, number must be between 1 and 10.");
            return getInteger(min, max);
        } else {
            System.out.println("Number chosen: " + userInput);
        }
        return userInput;
    }

    public static long getFactorial(Scanner sc) throws InterruptedException {
        System.out.println("Choose a number between 1 and 10.");
        long input = sc.nextInt();

        if (input < 1 || input > 10) {
            System.out.println("Number must be between 1 and 10");
            return getFactorial(sc);
        } else {
            long count = 1;
            for (int i = 1; i <= input; i++) {
                count *= i;
                System.out.println(i + "!" + " = " + count);
            }
        System.out.println("Factorial output of " + input + " is: " + count);
                System.out.println("Would you like to continue?");
                String goAgain = sc.next().toLowerCase();
            if (goAgain.startsWith("y")) {
                getFactorial(sc);
            } else {
                Thread.sleep(400);
                System.out.println("Goodbye.");
            }
        return count;
        }
    }


}
