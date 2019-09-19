import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class LAllCapitals {
    public static void main(String[] args) throws IOException {
        String filePath = "H:\\input.txt";
        String outputPath = "H:\\allCapitals.txt";

        BufferedReader reader = new BufferedReader(new FileReader(filePath));

        StringBuilder outputLine = new StringBuilder();
        String line = reader.readLine();
        while (line != null) {
            for (char symbol : line.toCharArray()) {
                if (Character.isLetter(symbol)) {
                    outputLine.append(String.valueOf(symbol).toUpperCase());
                } else {
                    outputLine.append(symbol);
                }
            }
            outputLine.append(System.lineSeparator());
            line = reader.readLine();
        }

        PrintWriter printer = new PrintWriter(outputPath);
        printer.println(outputLine);
        printer.close();
    }
}
