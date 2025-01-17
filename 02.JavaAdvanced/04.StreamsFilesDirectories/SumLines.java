import java.io.*;

public class SumLines {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\Username\\Desktop\\input.txt";
        String outFile = "C:\\Users\\Username\\Desktop\\output.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath));
             FileWriter writer = new FileWriter(outFile)) {

            String line;

            while ((line = reader.readLine()) != null) {
                int asciiSum = 0;
                for (char symbol : line.toCharArray()) {
                    asciiSum += symbol;
                }

                writer.write(String.valueOf(asciiSum));
                writer.write(System.lineSeparator());
            }

        } catch (IOException e) {
            System.err.println("Error processing files: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
