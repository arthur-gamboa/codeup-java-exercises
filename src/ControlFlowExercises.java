import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    int i = 5;
    while(i <= 15) {
        System.out.println(i++);
    }

        do {
            System.out.println("Please enter your grade from 0 - 100");
            int grade = scanner.nextInt();
            grader(grade);
            System.out.println("Would you like to continue? [Y]es / [N]o");
            String choice = scanner.next();
            if (!choice.equalsIgnoreCase("Yes") && !choice.equalsIgnoreCase("yea") && !choice.equalsIgnoreCase("y")) {
                break;
            }
        } while (true) ;
            System.out.println("Goodbye.");

//    doWhile(2);
//    fizzBuzz();
//    table(scanner);
    }


    public static void doWhile(long j) {
        do {
            System.out.println(j);
            j *= j;
        } while (j <= 1000000);
        System.out.println();
    }

    public static void fizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                    System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void table (Scanner scanner) {
        System.out.println("Please enter an integer down below:");
        int input = scanner.nextInt();
        System.out.printf("%-11s | %-11s | %-11s%n", "number", "squared", "cubed");
        for (int i = 1; i <= input; i++) {
            int squared = i*i;
            int cubed = i*i*i;
            System.out.printf("%-11d | %-11d | %-11d%n", i, squared, cubed);
        }
    }

    public static void grader(int grade) {
        if (grade >= 88 && grade <= 100) {
            System.out.println("A");
        } else if (grade >= 80 && grade <= 87) {
            System.out.println("B");
        } else if (grade >= 76 && grade <= 79) {
            System.out.println("C");
        } else if (grade >= 60 && grade <= 66) {
            System.out.println("D");
        } else if (grade <= 59) {
            System.out.println("F");
        } else {
            System.out.println("Number must be between 0 - 100");
        }
    }






}
