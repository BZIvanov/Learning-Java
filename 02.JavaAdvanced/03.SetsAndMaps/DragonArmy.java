import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class DragonArmy {
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

        dragons.forEach((key1, value1) -> {
            double avgDamage = 0;
            double avgHealth = 0;
            double avgArmor = 0;
            int[] aggragatedData = new int[3];

            value1.forEach((_, value) -> {
                int damage = value[0];
                int health = value[1];
                int armor = value[2];

                aggragatedData[0] += damage;
                aggragatedData[1] += health;
                aggragatedData[2] += armor;
            });

            int dragonsCount = value1.size();
            avgDamage = aggragatedData[0] / (dragonsCount * 1.00);
            avgHealth = aggragatedData[1] / (dragonsCount * 1.00);
            avgArmor = aggragatedData[2] / (dragonsCount * 1.00);

            System.out.printf("%s::(%.2f/%.2f/%.2f)%n",
                    key1,
                    avgDamage,
                    avgHealth,
                    avgArmor
            );

            value1.forEach((key, value) -> System.out.printf("-%s -> damage: %d, health: %d, armor: %d%n",
                    key,
                    value[0],
                    value[1],
                    value[2]
            ));
        });

        sc.close();
    }
}
