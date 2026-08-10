import java.util.Scanner;

public class KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dnaLength = Integer.parseInt(scanner.nextLine());

        int bestSequenceLength = -1;
        int bestStartIndex = dnaLength;
        int bestSum = -1;
        int bestSampleNumber = 0;
        String bestDna = "";
        int sampleNumber = 0;

        String line = scanner.nextLine();
        while (!line.equals("Clone them!")) {
            sampleNumber++;
            String dna = line.replace("!", "").trim();

            int currentLength = 0;
            int longestLength = 0;
            int longestStartIndex = dnaLength;
            int sum = 0;

            for (int i = 0; i < dna.length(); i++) {
                if (dna.charAt(i) == '1') {
                    sum++;
                    currentLength++;

                    if (currentLength > longestLength) {
                        longestLength = currentLength;
                        longestStartIndex = i - currentLength + 1;
                    }
                } else {
                    currentLength = 0;
                }
            }

            boolean isBetter = longestLength > bestSequenceLength
                    || longestLength == bestSequenceLength && longestStartIndex < bestStartIndex
                    || longestLength == bestSequenceLength && longestStartIndex == bestStartIndex && sum > bestSum;

            if (isBetter) {
                bestSequenceLength = longestLength;
                bestStartIndex = longestStartIndex;
                bestSum = sum;
                bestSampleNumber = sampleNumber;
                bestDna = dna;
            }

            line = scanner.nextLine();
        }

        System.out.printf("Best DNA sample %d with sum: %d.%n", bestSampleNumber, bestSum);
        for (int i = 0; i < bestDna.length(); i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(bestDna.charAt(i));
        }
        System.out.println();
        scanner.close();
    }
}
