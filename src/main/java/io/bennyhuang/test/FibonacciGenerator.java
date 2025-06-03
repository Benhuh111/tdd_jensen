package io.bennyhuang.test;

public class FibonacciGenerator {
    public int[] generate(int n) {
        // Validerar negativa tal
        if (n < 0) {
            throw new IllegalArgumentException("N must be non-negative");
        }
        // Hanterar specialfall
        if (n == 0) {
            return new int[]{};
        }

        int[] sequence = new int[n];
        if (n >= 1) {
            sequence[0] = 0;
        }
        if (n >= 2) {
            sequence[1] = 1;
        }

        for (int i = 2; i < n; i++) {
            sequence[i] = sequence[i-1] + sequence[i-2];
        }

        return sequence;
    }
}