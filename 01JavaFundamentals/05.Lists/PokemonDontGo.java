import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDontGo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> pokemons = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayList::new));

        int sum = 0;

        while (!pokemons.isEmpty()) {
            int index = Integer.parseInt(sc.nextLine());

            if (index >= 0 && index < pokemons.size()) {
                int element = pokemons.get(index);
                sum += element;
                pokemons.remove(index);
                changeListElements(pokemons, element);
            } else if (index < 0) {
                int element = pokemons.getFirst();
                sum += element;
                pokemons.set(0, pokemons.getLast());
                changeListElements(pokemons, element);
            } else {
                int element = pokemons.getLast();
                sum += element;
                pokemons.set(pokemons.size() - 1, pokemons.getFirst());
                changeListElements(pokemons, element);
            }
        }

        System.out.println(sum);

        sc.close();
    }

    public static void changeListElements(ArrayList<Integer> pokemons, int element) {
        for (int i = 0; i < pokemons.size(); i++) {
            if (pokemons.get(i) <= element) {
                pokemons.set(i, pokemons.get(i) + element);
            } else {
                pokemons.set(i, pokemons.get(i) - element);
            }
        }
    }
}
