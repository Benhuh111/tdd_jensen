package io.bennyhuang.test;

import java.util.List;
import java.util.Random;

public class Magic8Ball {

    public static final List<String> POSSIBLE_ANSWERS = List.of(
            "Yes",
            "No",
            "Ask again later",
            "Cannot predict now",
            "Don't count on it",
            "Most likely",
            "Outlook good",
            "Very doubtful"
    );

    private final Random random = new Random();

    public String ask(String question) {
        return POSSIBLE_ANSWERS.get(random.nextInt(POSSIBLE_ANSWERS.size()));
    }
}