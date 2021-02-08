package util;

public class InputTest extends Input {
    public static void main(String[] args) {

        Input input = new Input();
        System.out.println("Give me a number: " + input.getInt());

        System.out.println("Your input: " + input.getDouble());
    }
}
