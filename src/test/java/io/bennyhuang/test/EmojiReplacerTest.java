package io.bennyhuang.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmojiReplacerTest {
    @Test
    void shouldHandleNullAndEmptyInput() {
        // Arrange
        EmojiReplacer replacer = new EmojiReplacer();

        // Act & Assert
        assertEquals("", replacer.replaceWithEmojis(null));
        assertEquals("", replacer.replaceWithEmojis(""));
        assertEquals("", replacer.replaceWithEmojis("   "));
    }

    @Test
    void shouldReplaceSimpleWords() {
        // Arrange
        EmojiReplacer replacer = new EmojiReplacer();

        // Act & Assert
        assertEquals("i am 😊", replacer.replaceWithEmojis("i am happy"));
        assertEquals("feeling 😢", replacer.replaceWithEmojis("feeling sad"));
    }

    @Test
    void shouldKeepUnmappedWords() {
        // Arrange
        EmojiReplacer replacer = new EmojiReplacer();

        // Act
        String result = replacer.replaceWithEmojis("hello world");

        // Assert
        assertEquals("hello world", result);
    }

    @Test
    void shouldReplaceMultipleWords() {
        // Arrange
        EmojiReplacer replacer = new EmojiReplacer();

        // Act
        String result = replacer.replaceWithEmojis("happy heart sad star");

        // Assert
        assertEquals("😊 ❤️ 😢 ⭐", result);
    }

    @Test
    void shouldHandleMixedCase() {
        // Arrange
        EmojiReplacer replacer = new EmojiReplacer();

        // Act
        String result = replacer.replaceWithEmojis("HAPPY happy HaPPy");

        // Assert
        assertEquals("😊 😊 😊", result);
    }
}