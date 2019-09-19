import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class NMinerTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> result = new LinkedHashMap<>();

        String line;
        int index = 0;
        String item = "";
        while (!"stop".equals(line = sc.nextLine())) {
            if (index % 2 == 0) {
                result.putIfAbsent(line, 0);
                item = line;
            } else {
                int value = Integer.parseInt(line);
                result.put(item, result.get(item) + value);
            }
            index++;
        }

        for (Map.Entry<String, Integer> kvp : result.entrySet()) {
            System.out.println(String.format("%s -> %d", kvp.getKey(), kvp.getValue()));
        }
    }
}
