package fizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FizzBuzzFinderTest {
  FizzBuzzFinder fizzBuzzFinder = new FizzBuzzFinder();

  @ParameterizedTest
  @CsvSource({
      "45, FizzBuzz",
      "13,  13 is not manipulable"
  })
  void getFizzBuzz(int number, String expected) {
    String actual = fizzBuzzFinder.getFizzBuzz(number);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void getFizzBuzz1() {
    int number = 13;
    String actual = fizzBuzzFinder.getFizzBuzz(number);
    String expected = "13 is not manipulable";
    Assertions.assertEquals(expected, actual);
  }

}