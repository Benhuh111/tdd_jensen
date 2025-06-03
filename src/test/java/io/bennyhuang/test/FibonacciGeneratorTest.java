package io.bennyhuang.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FibonacciGeneratorTest {
    @Test
    void shouldReturnEmptyArrayForZero() {
        // Arrange
        FibonacciGenerator generator = new FibonacciGenerator();

        // Act
        int[] result = generator.generate(0);

        // Assert
        assertArrayEquals(new int[]{}, result);
    }

    @Test
    void shouldReturnFirstNumberForOne() {
        // Arrange
        FibonacciGenerator generator = new FibonacciGenerator();

        // Act
        int[] result = generator.generate(1);

        // Assert
        assertArrayEquals(new int[]{0}, result);
    }

    @Test
    void shouldReturnFirstTwoNumbers() {
        // Arrange
        FibonacciGenerator generator = new FibonacciGenerator();

        // Act
        int[] result = generator.generate(2);

        // Assert
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    void shouldGenerateFibonacciSequence() {
        // Arrange
        FibonacciGenerator generator = new FibonacciGenerator();

        // Act
        int[] result = generator.generate(7);

        // Assert
        assertArrayEquals(new int[]{0, 1, 1, 2, 3, 5, 8}, result);
    }

    @Test
    void shouldThrowExceptionForNegativeInput() {
        // Arrange
        FibonacciGenerator generator = new FibonacciGenerator();

        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> generator.generate(-1));
    }
}