package io.bennyhuang.test;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class TestController {
    private final Magic8Ball magic8Ball = new Magic8Ball();
    private final WordCounter wordCounter = new WordCounter();
    private final FibonacciGenerator fibonacciGenerator = new FibonacciGenerator();

    @GetMapping("/magic8ball")
    public String askMagic8Ball(@RequestParam String question) {
        return magic8Ball.ask(question);
    }

    @GetMapping("/wordcount")
    public int countWords(@RequestParam String text) {
        return wordCounter.countWords(text);
    }

    @GetMapping("/fibonacci/{n}")
    public int[] generateFibonacci(@PathVariable int n) {
        return fibonacciGenerator.generate(n);
    }

    @GetMapping("/emoji")
    public String replaceEmojis(@RequestParam String text) {
        return new EmojiReplacer().replaceWithEmojis(text);
    }
}