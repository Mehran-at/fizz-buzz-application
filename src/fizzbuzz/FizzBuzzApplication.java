package fizzbuzz;
//Derek has learned a lot about programming lately and he decides to apply for a job as a junior developer. During the job interview he receives some sort of
// exercise called FizzBuzz.
//    Develop the following code:
//      a. Define the isMultiple action that receives two numbers and returns true if the first number is divisible by the second. Otherwise it returns false.
//      b. Define the fizzBuzz action that receives a number and returns a word depending on some factors. The action returns Fizz if the number is multiple of
//        three and Buzz if it is a multiple of five. For numbers that are multiples of both three and five it returns FizzBuzz. For numbers that are either, then
//        it just returns the number as text.
//      c. Write a code that asks for a number, applies the fizzBuzz action and says the result.

public class FizzBuzzApplication {
  public static void main(String[] args) {
    FizzBuzzFinder fizzBuzzFinder = new FizzBuzzFinder();
    Integer number = 45;
    System.out.println(fizzBuzzFinder.isMultiple(number, 3));
    System.out.println(fizzBuzzFinder.getFizzBuzz(number, 3, 5));

  }
}
