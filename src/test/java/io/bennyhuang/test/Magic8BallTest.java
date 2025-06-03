package io.bennyhuang.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.HashSet;
import java.util.Set;


class Magic8BallTest {
    @Test
    void shouldReturnValidAnswer() {
        // Arrange
        Magic8Ball magic8Ball = new Magic8Ball();

        // Act
        String answer = magic8Ball.ask("Will it rain today?");

        // Assert
        assertNotNull(answer);
        assertTrue(Magic8Ball.POSSIBLE_ANSWERS.contains(answer));
    }

    @Test
    void shouldReturnDifferentAnswers() {
        // Arrange
        Magic8Ball magic8Ball = new Magic8Ball();
        Set<String> uniqueAnswers = new HashSet<>();

        // Act
        for (int i = 0; i < 20; i++) {
            uniqueAnswers.add(magic8Ball.ask("Will I be lucky?"));
        }

        // Assert
        assertTrue(uniqueAnswers.size() > 3);
    }
}