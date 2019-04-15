//package fizzbuzz;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.CsvSource;
//
//class FizzBuzzFinderTest {
//  FizzBuzzFinder fizzBuzzFinder = new FizzBuzzFinder();
//
//  @ParameterizedTest
//  @CsvSource({
//      "2, 5, false",
//      "9, 18, false",
//      "0, 1, true",
//      "4, 2, true",
//      "2, 2, true",
//  })
//  void testIsMultipleWorks(int number, int multiple, boolean expected) {
//    boolean actual = fizzBuzzFinder.isMultiple(number, multiple);
//    Assertions.assertEquals(actual, expected);
//  }
//
////    @Test
////    void isMultiple() {
////        Integer number = 2;
////        Integer multiple = 5;
////        boolean actual = fizzBuzzFinder.isMultiple(number, multiple);
////        boolean expected = false;
////        Assertions.assertEquals(actual, expected);
////    }
//
//// -   @Test
////    void isMultipleOne() {
////        Integer number = 1;
////        Integer multiple = 0;
////        boolean actual = fizzBuzzFinder.isMultiple(number, multiple);
////        boolean expected = true;
////        Assertions.assertEquals(actual, expected);
////    }
//
////    @Test
////    void isMultipleTwo() {
////        Integer number = 9;
////        Integer multiple = 18;
////        boolean actual = fizzBuzzFinder.isMultiple(number, multiple);
////        boolean expected = false;
////        Assertions.assertEquals(actual, expected);
////    }
//
////  -  @Test
////    void isMultipleThree() {
////        Integer number = 0;
////        Integer multiple = 0;
////        boolean actual = fizzBuzzFinder.isMultiple(number, multiple);
////        boolean expected = false;
////        Assertions.assertEquals(actual, expected);
////    }
//
////    @Test
////    void isMultipleFour() {
////        Integer number = 0;
////        Integer multiple = 1;
////        boolean actual = fizzBuzzFinder.isMultiple(number, multiple);
////        boolean expected = true;
////        Assertions.assertEquals(actual, expected);
////    }
//
//
//  @ParameterizedTest
//  @CsvSource({
//      "15,FizzBuzz",
//      "30, FizzBuzz",
//      "45, FizzBuzz",
//      "225, FizzBuzz",
//      "9, Fizz",
//      "3,Fizz",
//      "5, Buzz",
////            "15, emptyString"
//  })
//  void findFizzBuzzWorks(int number, String expected) {
//    String actual = fizzBuzzFinder.getFizzBuzz(number,5, 3);
//    Assertions.assertEquals(actual, expected);
//  }
//
////    @Test
////    void findFizzBuzz() {
////        Integer number = 15;
////        String actual = fizzBuzzFinder.findFizzBuzz(number);
////        String expected = "FizzBuzz";
////    }
//
////    @Test
////    void findFizzBuzzOne() {
////        Integer number = 30;
////        String actual = fizzBuzzFinder.findFizzBuzz(number);
////        String expected = "FizzBuzz";
////    }
//
////    @Test
////    void findFizzBuzzTwo() {
////        Integer number = 45;
////        String actual = fizzBuzzFinder.findFizzBuzz(number);
////        String expected = "FizzBuzz";
////    }
//
////    @Test
////    void findFizzBuzzTwoo() {
////        Integer number = 225;
////        String actual = fizzBuzzFinder.findFizzBuzz(number);
////        String expected = "FizzBuzz";
////    }
//
////    @Test
////    void findFizzBuzzThree() {
////        Integer number = 9;
////        String actual = fizzBuzzFinder.findFizzBuzz(number);
////        String expected = "Fizz";
////    }
//
////    @Test
////    void findFizzBuzzFour() {
////        Integer number = 3;
////        String actual = fizzBuzzFinder.findFizzBuzz(number);
////        String expected = "Fizz";
////    }
//
////    @Test
////    void findFizzBuzzFive() {
////        Integer number = 5;
////        String actual = fizzBuzzFinder.findFizzBuzz(number);
////        String expected = "Buzz";
////    }
//
////    @Test
////    void findFizzBuzzSix() {
////        Integer number = 15;
////        String actual = fizzBuzzFinder.findFizzBuzz(number);
////        String expected = "Buzz";
////    }
//
//  @Test
//  void findFizzBuzzSeven() {
//    Integer number = 15;
//    String actual = fizzBuzzFinder.findFizzBuzz(number);
//    String expected = "";
//  }
//}