import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class AllCapitals {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\input.txt";
        String outputPath = "C:\\output.txt";

        try (
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            PrintWriter printer = new PrintWriter(outputPath)
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                StringBuilder outputLine = new StringBuilder();
                for (char symbol : line.toCharArray()) {
                    outputLine.append(Character.toUpperCase(symbol));
                }
                printer.println(outputLine); // Write to the output file
            }
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
