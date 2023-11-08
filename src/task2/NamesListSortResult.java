package src.task2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class NamesListSortResult {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("1. Mariya", "2. Bogdan", "3. Nataliya", "4. Oleksiy", "5. Olga", "6. Vera", "7. Olexander");
        System.out.println("Список імен до сортування: " + names);
        Comparator<String> comparator = (name1, name2) -> name2.charAt(0) - name1.charAt(0);
        Stream<String> nameStream = names.stream().map(name -> name.toUpperCase()).sorted(comparator);
        List<String> sortedNamesList = nameStream.toList();

        System.out.println("Список імен після сортування: " + sortedNamesList);
    }
}
