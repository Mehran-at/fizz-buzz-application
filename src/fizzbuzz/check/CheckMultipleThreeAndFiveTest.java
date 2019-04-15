package fizzbuzz.check;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CheckMultipleThreeAndFiveTest {
  CheckMultipleThreeAndFive checkMultipleThreeAndFive = new CheckMultipleThreeAndFive();

  @ParameterizedTest
  @CsvSource({
      "45, true",
      "15, true",
      "11, false",
      "1, false"
  })
  void isMultiple(int number, boolean expected) {
    boolean actual = checkMultipleThreeAndFive.isMultiple(number);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void getName() {
    String actual = checkMultipleThreeAndFive.getName();
    String expected = "FizzBuzz";
    Assertions.assertEquals(expected, actual);
  }
}