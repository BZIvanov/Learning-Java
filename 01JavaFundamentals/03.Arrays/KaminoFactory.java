import java.util.Scanner;

public class KaminoFactory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();

        int bestLengt = 0;
        String bestDna = "";
        int bestIndex = 0;
        int bestSum = 0;
        int bestCounter = 0;
        int counter = 0;

        while (!line.equals("Clone them!")) {
            counter++;
            String sequence = line.replaceAll("!", "");

            String[] dnas = sequence.split("0");

            int maxLength = 0;
            int sum = 0;
            String bestLocalDna = "";
            for (String dna : dnas) {
                if (dna.length() > maxLength) {
                    maxLength = dna.length();
                    bestLocalDna = dna;
                }
                sum += dna.length();
            }

            int beginIndex = sequence.indexOf(bestLocalDna);

            if (maxLength > bestLengt) {
                bestLengt = maxLength;
                bestDna = sequence;
                bestIndex = beginIndex;
                bestSum = sum;
                bestCounter = counter;
            } else if (maxLength == bestLengt && (beginIndex < bestIndex || sum > bestSum)) {
                bestLengt = maxLength;
                bestDna = sequence;
                bestIndex = beginIndex;
                bestSum = sum;
                bestCounter = counter;
            } else if (counter == 1) {
                bestLengt = maxLength;
                bestDna = sequence;
                bestIndex = beginIndex;
                bestSum = sum;
                bestCounter = counter;
            }

            line = sc.nextLine();
        }

        System.out.printf("Best DNA sample " + "%d with sum: %d.%n", bestCounter, bestSum);

        for (int i = 0; i < bestDna.length(); i++) {
            System.out.print(bestDna.charAt(i) + " ");
        }
        System.out.println();
    }
}
