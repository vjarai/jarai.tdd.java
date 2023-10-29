package ex01_redGreenRefactor;

public class FizzBuzzGame {
    public Object GetResponse(int number) {
        if (number < 1 || number > 100) throw new IllegalArgumentException("number");


        if (number % 15 == 0) return "FizzBuzz";

        if (number % 3 == 0) return "Fizz";

        if (number % 5 == 0) return "Buzz";

        return number;
    }
}

