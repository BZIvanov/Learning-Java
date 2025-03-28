import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());

        Map<String, List<String>> resMap = new LinkedHashMap<>();

        for (int i = 0; i < num; i++) {
            String key = sc.nextLine();
            String value = sc.nextLine();

            resMap.putIfAbsent(key, new ArrayList<>());
            resMap.get(key).add(value);
        }

        String pattern = "%s - %s";
        for (Map.Entry<String, List<String>> kvp : resMap.entrySet()) {
            String key = kvp.getKey();
            String value = String.join(", ", kvp.getValue());

            System.out.printf(pattern + "%n", key, value);
        }

        sc.close();
    }
}
