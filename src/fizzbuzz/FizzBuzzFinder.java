package fizzbuzz;

public class FizzBuzzFinder implements Check {

  @Override
  public Boolean isMultiple(int number, int multiple) {
    return number % multiple == 0;
  }

  @Override
  public String getFizzBuzz(int number, int multipleNumberOne, int multipleNUmberTwo) {
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
