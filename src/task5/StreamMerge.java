package src.task5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMerge {
    public static void main(String[] args) {
        Stream<String> first = Stream.of("apple", "pineapple", "orange", "strawberry", "grape", "pear", "plum" );
        Stream<String> second = Stream.of("plate", "salad bowl", "fruit plate", "cup");

        Stream<String> resultMerge = zip(first, second);
        resultMerge.peek(System.out::println)
                .collect(Collectors.toList());
    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        List<T> resultList = new ArrayList<>();

        Iterator<T> iteratorFirst = first.iterator();
        Iterator<T> iteratorSecond = second.iterator();

        while(iteratorFirst.hasNext() && iteratorSecond.hasNext()) {
            resultList.add(iteratorFirst.next());
            resultList.add(iteratorSecond.next());
        }
        return resultList.stream();
    }
}
