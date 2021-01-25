import java.util.Scanner;

public class Bob {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello, my name is Bob. Say something below and I will respond.");
        String input = sc.nextLine().trim();
        if(input.endsWith("?")) {
            Thread.sleep(400);
            System.out.println("Sure.");
        } else if (input.endsWith("!")) {
            Thread.sleep(400);
            System.out.println("Woah, chill out!");
        } else if (input.equals("")) {
            Thread.sleep(400);
            System.out.println("Fine. Be that way!");
        } else {
            Thread.sleep(400);
            System.out.println("Whatever");
        }

//        while(true) {
//            System.out.println("Hello, my name is Bob. Say something, ask anything, I don't care..");
//            String input = sc.nextLine().trim();
//
//            if (input.endsWith("?")) {
//                System.out.println("Sure.");
//            } else if (input.endsWith("!")) {
//                System.out.println("Woah! Chill out.");
//            } else if (input.isBlank()) {
//                System.out.println("Fine, be that way.");
//            } else if (input.toLowerCase().equals("exit")) {
//                System.out.println("Goodbye");
//                break;
//            } else {
//                System.out.println("Whatever");
//            }
//        }
//    }
//}
