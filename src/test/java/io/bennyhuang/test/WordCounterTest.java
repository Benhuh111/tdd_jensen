package io.bennyhuang.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class WordCounterTest {
    @Test
    void shouldReturnZeroForEmptyString() {
        // Arrange
        WordCounter counter = new WordCounter();

        // Act
        int resultEmpty = counter.countWords("");
        int resultSpaces = counter.countWords("   ");

        // Assert
        assertEquals(0, resultEmpty);
        assertEquals(0, resultSpaces);
    }

    @Test
    void shouldCountSingleWord() {
        // Arrange
        WordCounter counter = new WordCounter();

        // Act
        int result = counter.countWords("hello");

        // Assert
        assertEquals(1, result);
    }

    @Test
    void shouldCountMultipleWords() {
        // Arrange
        WordCounter counter = new WordCounter();

        // Act
        int result = counter.countWords("hello world test");

        // Assert
        assertEquals(3, result);
    }

    @Test
    void shouldHandleMultipleSpaces() {
        // Arrange
        WordCounter counter = new WordCounter();

        // Act
        int result = counter.countWords("hello   world     test");

        // Assert
        assertEquals(3, result);
    }

    @Test
    void shouldHandlePunctuation() {
        // Arrange
        WordCounter counter = new WordCounter();

        // Act
        int result = counter.countWords("Hello, world! How's it?");

        // Assert
        assertEquals(4, result);
    }
}