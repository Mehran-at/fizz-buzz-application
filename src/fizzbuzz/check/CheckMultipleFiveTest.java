package fizzbuzz.check;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CheckMultipleFiveTest {
  CheckMultipleFive checkMultipleFive = new CheckMultipleFive();

  @ParameterizedTest
  @CsvSource({
      "1, false",
      "5, true",
      "3, false",
      "15, true"
  })
  void isMultiple(int number, boolean expected) {
    Boolean actual = checkMultipleFive.isMultiple(number);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void getName() {
    String actual = checkMultipleFive.getName();
    String expected = "Buzz";
    Assertions.assertEquals(expected, actual);
  }
}