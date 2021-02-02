import java.util.Random;

public class ServerNameGenerator {


//TODO: Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.

    private static String[] adj = {
            "flawless",
            "purple",
            "educated",
            "tricky",
            "capable",
            "pushy",
            "merciful",
            "overt",
            "obnoxious",
            "strong"
    };
    private static String[] noun = {
            "scissors",
            "axe",
            "battery",
            "wallet",
            "tissue",
            "lamp",
            "toothbrush",
            "rope",
            "balloon",
            "penguin"
    };

////TODO: Create a method that will return a random element from an array of strings.

    public static void main(String[] args) {

//        Random randomizer = new Random();
//        //grab a random noun and adj
//        int randInt = randomizer.nextInt(11);
//        System.out.println(" random adjective is : " + adj[randInt]);
//        System.out.println( " random noun is : " + noun[randInt]);
//        String randAdj = adj[randInt];
//        String randNoun = noun[randInt];
//        System.out.println();
//        System.out.println("Here is your server name: " + randAdj + "-" + randNoun);

        //another method
        String nouns = getRandomWord(noun);
        String adjs = getRandomWord(adj);
        System.out.println(adjs + "-" + nouns);
    }

    public static String getRandomWord(String[] words) {
        //grab a random noun and adj
        Random randomizer = new Random();
        int randInt = randomizer.nextInt(words.length);
        return words[randInt];
    }

}
