package fizzbuzz.check;

public class CheckMultipleFive implements Check {

  @Override
  public Boolean isMultiple(int number) {
    return number % 5 == 0;
  }

  @Override
  public String getName() {
    return "Buzz";
  }
}
