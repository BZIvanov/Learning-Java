import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;

public class SumBytes {
    public static void main(String[] args) throws IOException {
        String filePath = "D:\\input.txt";
        String outputPath = "D:\\output.txt";

        BufferedReader reader = new BufferedReader(new FileReader(filePath));

        String line = reader.readLine();
        BigInteger totalSum = BigInteger.ZERO;
        while (line != null) {
            for (char symbol : line.toCharArray()) {
                totalSum = totalSum.add(BigInteger.valueOf(symbol));
            }
            line = reader.readLine();
        }

        PrintWriter printer = new PrintWriter(outputPath);
        printer.println(totalSum.toString());
        printer.close();
    }
}
