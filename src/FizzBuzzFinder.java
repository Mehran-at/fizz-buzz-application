import java.util.Scanner;

public class FizzBuzzFinder {


    public boolean isMultiple(Integer number, Integer multiple) {
        if (number == 1 || number % multiple == 0) {
            return true;
        } else return false;
    }


    public String findFizzBuzz(Integer number) {
        if (isMultiple(number, 3) && isMultiple(number, 5)) {
            return "FizzBuzz";
        }
        if (isMultiple(number, 3)) {
            return "Fizz";
        }
        if (isMultiple(number, 5)) {
            return "Buzz";
        }
        return "";
    }
}
