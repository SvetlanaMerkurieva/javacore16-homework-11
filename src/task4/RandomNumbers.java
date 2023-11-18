package src.task4;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RandomNumbers {
    public static void main(String[] args) {

        RandomAlgorithm random = new RandomAlgorithm(25214903917L, 11, 2^48);

        Stream<Long> iterate = Stream.iterate(25L, (seed) -> random.withSeed(seed).nextNumber());
        iterate.limit(15).peek(System.out::println).collect(Collectors.toList());
    }
 }
