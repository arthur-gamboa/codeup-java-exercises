package movies;
import util.Input;

public class MoviesApplication {

    public static void main(String[] args) {
        //Use the Input class to grab a choice from the user:

        Input userInput = new Input();
        int userChoice = 0;
        Movie[] allMovies = new MoviesArray.findAll();
        do {
            int userChoice = userInput.getInt("What would you like to do?\n" +
                    "\n" +
                    "0 - exit\n" +
                    "1 - view all movies\n" +
                    "2 - view movies in the animated category\n" +
                    "3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the scifi category\n" +
                    "\n" +
                    "Enter your choice:");
            System.out.println(userChoice);

            // a way to show all movies
            switch (userChoice) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    showMovies(userChoice, showMovies);
                case 0:
                    break;
                default:
                    // this covers anything else than what's above
                    System.out.println("That was not a valid choice.");
            }
            // need a way to show only movies in category

        } while (userChoice != 0);

        System.out.println("Thank you for playing!");
    }

    public static void showMovies(int category) {
        // find out what category was chosen and list movies in that category
        // 2 - animated
        // 3 - drama
        // 4 - horror
        // 5 - sci-fi
        // 6 - musical
        String categoryName = "";

        for (Movie thisMovie : allMovies) {
            switch (category) {
                case 1: // all
                    System.out.println(thisMovie.getName());
                    break;
                case 2:
                    System.out.print(thisMovie.getCategory().equals("animated") ? thisMovie.getName()+"\n" : "");
                    break;
                case 3:
                    System.out.print(thisMovie.getCategory().equals("drama") ? thisMovie.getName()+"\n" : "");
                    break;
                case 4:
                    System.out.print(thisMovie.getCategory().equals("horror") ? thisMovie.getName()+"\n" : "");
                    break;
                case 5:
                    System.out.print(thisMovie.getCategory().equals("sci-fi") ? thisMovie.getName()+"\n" : "");
                    break;
                case 6:
                    System.out.print(thisMovie.getCategory().equals("musical") ? thisMovie.getName()+"\n" : "");
                    break;
            }
        }
    }
}