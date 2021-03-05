import java.util.Scanner;

public class HighLow {

    public static void main(String[] args) {
        System.out.println("We have selected a random number between 1 and 100.");
        System.out.println("Can you guess the number in 10 tries?");

        System.out.println(guessingGame(9));
    }

    static int randomNumber = (int) (Math.random() * 100) + 1;

    public static int guessingGame(int limit) {}
    Scanner scan = new Scanner(System.in);

    int counter = 0;
    int guess;
    System.out.println("Guess your number");
    guess = scan.nextInt();

    if (limit == 0) {
        System.out.println("Game over.");
        System.out.println("The number was " + randomNumber);
        return counter;
    } else {
        System.out.println("Nice!");
        System.out.println("Your chances on guesses: ");
        return 10 - limit;
    }

}
