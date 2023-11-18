package src.task4;

import java.util.concurrent.atomic.AtomicLong;

public class RandomAlgorithm {
    long a, c, m, s;
    private AtomicLong x;

    public RandomAlgorithm(long a, long c, long m) {
        this.a = a;
        this.c = c;
        this.m = m;
    }
    public RandomAlgorithm withSeed(long s) {
        this.s = s;
        x = new AtomicLong(s);
        return this;
    }

    public long nextNumber () {
        return ((a * x.getAndIncrement() + c) % m);
    }
}
