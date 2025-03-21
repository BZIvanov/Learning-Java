import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MergingLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> first = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt).toList();

        List<Integer> second = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt).toList();

        List<Integer> result = new ArrayList<>();

        int minSizeList = Math.min(first.size(), second.size());
        int maxSizeList = Math.max(first.size(), second.size());
        boolean firstLonger = first.size() > second.size();

        for (int i = 0; i < minSizeList; i++) {
            result.add(first.get(i));
            result.add(second.get(i));
        }

        for (int i = minSizeList; i < maxSizeList; i++) {
            if (firstLonger) {
                result.add(first.get(i));
            } else {
                result.add(second.get(i));
            }
        }

        System.out.println(result.toString().replaceAll("[\\[\\],]", ""));

        sc.close();
    }
}
