package fizzbuzz.check;

public class CheckMultipleThree implements Check {
  @Override
  public Boolean isMultiple(int number) {
    return number % 3 == 0;
  }

  @Override
  public String getName() {
    return "Fizz";
  }
}
