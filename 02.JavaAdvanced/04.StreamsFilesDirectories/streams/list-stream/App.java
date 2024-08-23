import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        // creating stream for a collection
        List<String> fruitsList = Arrays.asList("Apple", "Kiwi", "Banana");

        Stream<String> streamToPrint = fruitsList.stream();
        streamToPrint.forEach(System.out::println);

        // here we recreate the stream, because the previous will be closed before reaching this line of code
        List<String> filteredList = fruitsList
                .stream()
                .filter(fruit -> fruit.startsWith("B"))
                .collect(Collectors.toList());
        System.out.println(filteredList);
    }
}