import java.util.*;

public class HandsOfCards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Set<String>> players = new LinkedHashMap<>();

        String line;
        while (!"JOKER".equals(line = sc.nextLine())) {
            String[] tokens = line.split(":\\s+");
            String name = tokens[0];
            String[] cards = tokens[1].split(",\\s+");

            if (!players.containsKey(name)) {
                players.put(name, new HashSet<>());
            }
            for (String card : cards) {
                players.get(name).add(card);
            }
        }

        for (Map.Entry<String, Set<String>> hands : players.entrySet()) {
            long sum = getSum(hands);
            System.out.printf("%s: %d%n", hands.getKey(), sum);
        }
    }

    private static long getSum(Map.Entry<String, Set<String>> hands) {
        long sum = 0;

        for (String card : hands.getValue()) {
            int suitSize = 0;
            int countSize = 0;
            suitSize = switch (card.substring(card.length() - 1)) {
                case "S" -> 4;
                case "H" -> 3;
                case "D" -> 2;
                case "C" -> 1;
                default -> suitSize;
            };
            countSize = switch (card.substring(0, card.length() - 1)) {
                case "A" -> 14;
                case "K" -> 13;
                case "Q" -> 12;
                case "J" -> 11;
                default -> Integer.parseInt(card.substring(0, card.length() - 1));
            };
            sum += (long) suitSize * countSize;
        }
        return sum;
    }
}
