import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class MCountCharacterTypes {
    public static void main(String[] args) throws IOException {
        String filePath = "H:\\input.txt";
        String outputPath = "H:\\charTypes.txt";

        String text = Files.readString(Path.of(filePath)).replaceAll("\r\n", " ");

        int[] countData = new int[3];
        String vowels = "aeiou";
        String punctuation = "!,.?";
        for (char symbol : text.toCharArray()) {
            if (vowels.contains(symbol + "")) {
                countData[0]++;
            } else if (punctuation.contains(symbol + "")) {
                countData[2]++;
            } else if (symbol != ' ') {
                countData[1]++;
            }
        }

        PrintWriter printer = new PrintWriter(outputPath);
        printer.println(String.format("Vowels: %d%nConsonants: %d%nPunctuation: %d%n",
                countData[0], countData[1], countData[2]));
        printer.close();
    }
}
