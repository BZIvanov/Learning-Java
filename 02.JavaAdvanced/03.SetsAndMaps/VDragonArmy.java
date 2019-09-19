import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class VDragonArmy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedHashMap<String, TreeMap<String, int[]>> dragons = new LinkedHashMap<>();

        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String[] tokens = sc.nextLine().split("\\s+");
            String type = tokens[0];
            String name = tokens[1];
            int damage = tokens[2].equals("null") ? 45 : Integer.parseInt(tokens[2]);
            int health = tokens[3].equals("null") ? 250 : Integer.parseInt(tokens[3]);
            int armor = tokens[4].equals("null") ? 10 : Integer.parseInt(tokens[4]);

            if (!dragons.containsKey(type)) {
                dragons.put(type, new TreeMap<>() {{
                    put( name, new int[]{damage, health, armor} );
                }});
            } else {
                if (!dragons.get(type).containsKey(name)) {
                    dragons.get(type).put(name, new int[]{damage, health, armor} );
                } else {
                    dragons.get(type).get(name)[0] = damage;
                    dragons.get(type).get(name)[1] = health;
                    dragons.get(type).get(name)[2] = armor;
                }
            }
        }

        dragons.entrySet().forEach(entry -> {
            double avgDamage = 0;
            double avgHealth = 0;
            double avgArmor = 0;
            int[] aggragatedData = new int[3];

            entry.getValue().entrySet().stream().forEach(innerEntry -> {
                int damage = innerEntry.getValue()[0];
                int health = innerEntry.getValue()[1];
                int armor = innerEntry.getValue()[2];

                aggragatedData[0] += damage;
                aggragatedData[1] += health;
                aggragatedData[2] += armor;
            });

            int dragonsCount = entry.getValue().size();
            avgDamage = aggragatedData[0] / (dragonsCount * 1.00);
            avgHealth = aggragatedData[1] / (dragonsCount * 1.00);
            avgArmor = aggragatedData[2] / (dragonsCount * 1.00);

            System.out.println(String.format("%s::(%.2f/%.2f/%.2f)",
                    entry.getKey(),
                    avgDamage,
                    avgHealth,
                    avgArmor
            ));

            entry.getValue().entrySet().stream().forEach(dragon -> {
                System.out.println(String.format("-%s -> damage: %d, health: %d, armor: %d",
                        dragon.getKey(),
                        dragon.getValue()[0],
                        dragon.getValue()[1],
                        dragon.getValue()[2]
                ));
            });
        });
    }
}
