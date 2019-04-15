package fizzbuzz;

import fizzbuzz.check.Check;
import fizzbuzz.check.CheckMultipleFive;
import fizzbuzz.check.CheckMultipleThree;
import fizzbuzz.check.CheckMultipleThreeAndFive;

import java.util.Arrays;
import java.util.List;

public class FizzBuzzFinder {

  final List<Check> checks = Arrays.asList(new CheckMultipleThreeAndFive(), new CheckMultipleThree(), new CheckMultipleFive());

  public String getFizzBuzz(int number) {
    for (Check check : checks) {
      if (check.isMultiple(number)) {
        String name = check.getName();
        System.out.println(name);
        return check.getName();
      }
    }
    String message = number + " is not multiply of 3, 5 or both.";
    System.out.println(message);
    return message;
  }
}
