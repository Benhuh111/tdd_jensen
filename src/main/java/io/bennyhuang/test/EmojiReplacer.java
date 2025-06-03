package io.bennyhuang.test;

import java.util.HashMap;
import java.util.Map;

public class EmojiReplacer {
    private final Map<String, String> emojiMap;

    public EmojiReplacer() {
        emojiMap = new HashMap<>();
        // Common word to emoji mappings
        emojiMap.put("happy", "😊");
        emojiMap.put("sad", "😢");
        emojiMap.put("heart", "❤️");
        emojiMap.put("star", "⭐");
        emojiMap.put("sun", "☀️");
        emojiMap.put("moon", "🌙");
        emojiMap.put("smile", "😀");
        emojiMap.put("love", "💗");
    }

    public String replaceWithEmojis(String text) {
        if (text == null || text.trim().isEmpty()) {
            return "";
        }

        String result = text.toLowerCase();
        for (Map.Entry<String, String> entry : emojiMap.entrySet()) {
            result = result.replaceAll("\\b" + entry.getKey() + "\\b", entry.getValue());
        }
        return result;
    }
}