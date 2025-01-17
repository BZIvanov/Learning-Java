import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;

public class SumBytes {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\Username\\Desktop\\input.txt";
        String outputPath = "C:\\Users\\Username\\Desktop\\output.txt";

        try (
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            PrintWriter printer = new PrintWriter(outputPath)
        ) {
            BigInteger totalSum = BigInteger.ZERO;
            String line;

            // Read each line and calculate the sum of ASCII values
            while ((line = reader.readLine()) != null) {
                for (char symbol : line.toCharArray()) {
                    totalSum = totalSum.add(BigInteger.valueOf(symbol));
                }
            }

            printer.println(totalSum.toString());

        } catch (IOException e) {
            System.err.println("Error processing files: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
