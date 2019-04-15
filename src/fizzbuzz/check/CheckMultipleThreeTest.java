package fizzbuzz.check;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CheckMultipleThreeTest {
  CheckMultipleThree checkMultipleThree = new CheckMultipleThree();

  @ParameterizedTest
  @CsvSource({
      "1, false",
      "3, true",
      "15, true",
      "11, false",
      "45, true"
  })
  void isMultiple(int number, boolean expected) {
    boolean actual = checkMultipleThree.isMultiple(number);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void getName() {
    String actual = checkMultipleThree.getName();
    String expected = "Fizz";
    Assertions.assertEquals(expected, actual);
  }
}