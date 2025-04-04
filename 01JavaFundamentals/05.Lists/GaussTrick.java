import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int size = numbers.size();

        for (int i = 0; i < size / 2; i++) {
            numbers.set(i, numbers.get(i) + numbers.getLast());
            numbers.removeLast();
        }

        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));

        sc.close();
    }
}
