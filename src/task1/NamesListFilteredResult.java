package src.task1;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;

public class NamesListFilteredResult {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("1. Mariya", "2. Bogdan", "3. Nataliya", "4. Oleksiy", "5. Olga", "6. Vera", "7. Olexander");
        System.out.println("Список імен до фільтрації: " + names);
        Stream<String> nameStream = names.stream().filter((name -> name.charAt(0)%2 != 0));
        List<String> filteredNames = nameStream.toList();
        System.out.println("Список імен після фільтрації: " + filteredNames);
    }
}
