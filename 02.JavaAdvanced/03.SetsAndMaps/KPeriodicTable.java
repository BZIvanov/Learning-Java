import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class KPeriodicTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<String> elements = new TreeSet<>();

        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String[] line = sc.nextLine().split("\\s+");
            elements.addAll(Arrays.asList(line));
        }

        for (String el : elements) {
            System.out.print(el + " ");
        }
    }
}
