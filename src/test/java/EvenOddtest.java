import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("EvenOdd Test Suite")
public class EvenOddtest {

    @Test
    @DisplayName("Test positive even number")
    void testEvenNumber() {
       assertTrue(EvenOdd.isEven(5), "Intentional failure: 5 is not even!");
        assertFalse(EvenOdd.isOdd(4), "4 should not be odd");
        assertEquals("Even", EvenOdd.check(4));
    }

    @Test
    @DisplayName("Test positive odd number")
    void testOddNumber() {
        assertTrue(EvenOdd.isOdd(7), "7 should be odd");
        assertFalse(EvenOdd.isEven(7), "7 should not be even");
        assertEquals("Odd", EvenOdd.check(7));
    }

    @Test
    @DisplayName("Test zero is even")
    void testZero() {
        assertTrue(EvenOdd.isEven(0), "0 must be even");
        assertFalse(EvenOdd.isOdd(0), "0 must not be odd");
        assertEquals("Even", EvenOdd.check(0));
    }

    @ParameterizedTest(name = "Testing negative even: {0}")
    @ValueSource(ints = {-2, -4, -100})
    @DisplayName("Test negative even numbers")
    void testNegativeEvenNumbers(int number) {
        assertTrue(EvenOdd.isEven(number), number + " should be even");
        assertEquals("Even", EvenOdd.check(number));
    }

    @ParameterizedTest(name = "Testing negative odd: {0}")
    @ValueSource(ints = {-1, -3, -99})
    @DisplayName("Test negative odd numbers")
    void testNegativeOddNumbers(int number) {
        assertTrue(EvenOdd.isOdd(number), number + " should be odd");
        assertEquals("Odd", EvenOdd.check(number));
    }

    @Test
    @DisplayName("Test integer boundary values")
    void testBoundaryValues() {
        assertTrue(EvenOdd.isOdd(Integer.MAX_VALUE));
        assertEquals("Odd", EvenOdd.check(Integer.MAX_VALUE));

        assertTrue(EvenOdd.isEven(Integer.MIN_VALUE));
        assertEquals("Even", EvenOdd.check(Integer.MIN_VALUE));
    }
}

