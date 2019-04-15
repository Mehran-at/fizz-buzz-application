package fizzbuzz.check;

public class CheckMultipleThreeAndFive implements Check {
  @Override
  public Boolean isMultiple(int number) {
    return number % 3 == 0 && number % 5 == 0;
  }

  @Override
  public String getName() {
    return "FizzBuzz";
  }
}
