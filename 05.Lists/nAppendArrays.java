package company;

import java.util.*;
import java.util.stream.Collectors;

public class nAppendArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> first = Arrays.stream(sc.nextLine().split("\\s*\\|\\s*"))
                .collect(Collectors.toList());

        Collections.reverse(first);

        first = Arrays.stream(first.toString().split("[\\s,]+"))
                .map(e -> e.replaceAll("[\\[\\]]", ""))
                .collect(Collectors.toList());

        for (String s : first) {
            System.out.print(s + " ");
        }
    }
}
