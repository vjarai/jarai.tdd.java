package ex01_redGreenRefactor;

public class Main {
    public static void main(String[] args) {

        var game = new FizzBuzzGame();

        for (var number = 1; number <= 100; number++)
            System.out.println(game.GetResponse(number));

    }
}