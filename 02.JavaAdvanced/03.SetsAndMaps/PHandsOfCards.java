import java.util.*;

public class PHandsOfCards {
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
            for (int i = 0; i < cards.length; i++) {
                players.get(name).add(cards[i]);
            }
        }

        for (Map.Entry<String, Set<String>> hands : players.entrySet()) {
            long sum = 0;

            for (String card : hands.getValue()) {
                int suitSize = 0;
                int countSize = 0;
                switch (card.substring(card.length() - 1)) {
                    case "S": suitSize = 4; break;
                    case "H": suitSize = 3; break;
                    case "D": suitSize = 2; break;
                    case "C": suitSize = 1; break;
                }
                switch (card.substring(0, card.length() - 1)) {
                    case "A": countSize = 14; break;
                    case "K": countSize = 13; break;
                    case "Q": countSize = 12; break;
                    case "J": countSize = 11; break;
                    default: countSize = Integer.parseInt(card.substring(0, card.length() - 1));
                }
                sum += suitSize * countSize;
            }
            System.out.println(String.format("%s: %d", hands.getKey(), sum));
        }
    }
}
