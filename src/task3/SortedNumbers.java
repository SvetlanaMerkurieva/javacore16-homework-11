package src.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class SortedNumbers {
    public static void main(String[] args) {

        String[] elements = new String[]{"1, 2, 0", "4, 5"};

        ArrayList<String> newElements = new ArrayList<>();
        for (String element: elements) {
            String[] arrElements = element.split(",");
            for (String arrElement: arrElements) {
                newElements.add(arrElement);
            }
        }
        Comparator<String> comparator = (element1, element2) -> Integer.parseInt(element1) - Integer.parseInt(element2);

        Stream<String> elementsStream = newElements.stream().map(element -> element.trim()).sorted(comparator);
        List<String> newSortedElements = elementsStream.toList();
        ArrayList<Integer> sortedNumbers = new ArrayList<>();
        for (String newSortedElement : newSortedElements) {
            sortedNumbers.add(Integer.parseInt(newSortedElement));
        }
        System.out.print("Результат: "+ "\"");
        for (int i = 0; i < sortedNumbers.size() - 1; i++ ) {
            System.out.print(sortedNumbers.get(i) + ", ");
        }
        System.out.print(sortedNumbers.get(sortedNumbers.size()-1) + "\"");
    }
}
