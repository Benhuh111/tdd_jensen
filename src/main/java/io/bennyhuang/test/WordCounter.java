package io.bennyhuang.test;

public class WordCounter {
    // Kontrollerar null och tom input
    public int countWords(String text) {
        if (text == null || text.trim().isEmpty()) {
            return 0;
        }
        return text.trim().split("\\s+").length;
    }
}