import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double pi = 3.14159;
        System.out.format("The value of pi is approximately: %.2f.%n", pi);

        //*********************************************************************//

        System.out.print("Enter an integer: ");
        int userInt = scanner.nextInt();

        System.out.printf("Integer entered: %d%n", userInt);
        // Non-integer inputs result in an InputMismatchException error.

        //*********************************************************************//

        System.out.println("Enter three words down below:");
        String input1 = scanner.next();
        String input2 = scanner.next();
        String input3 = scanner.next();

        System.out.println("You've entered: " + input1 + ", " + input2 + " and " + input3);
        // Entering less than three words will not process until the third word is entered.
        // Entering more than three words result in processing only the first three words entered.

        //*********************************************************************//

        System.out.println("Enter a sentence down below:");
        scanner.nextLine();
        String sentence = scanner.nextLine();

        System.out.println("Sentence entered: " + sentence);

        //*********************************************************************//

        System.out.println("Enter the length of a random Classroom");
        double length = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter the width of the random Classroom");
        double width = Double.parseDouble(scanner.nextLine());

        double area = length * width;
        double perimeter = (length * 2) + (width * 2);
        System.out.printf("Area of classroom: %.1f ft^2%n", area);
        System.out.printf("Perimeter of classroom: %.1f ft%n", perimeter);


    }
}
