import java.io.*;

public class LineNumbers {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Username\\Desktop\\input.txt";
        String outputPath = "C:\\Users\\Username\\Desktop\\output.txt";

        try (
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            PrintWriter printer = new PrintWriter(new FileWriter(outputPath))
        ) {
            String line;
            int row = 1;

            // Read and write each line with a line number
            while ((line = reader.readLine()) != null) {
                printer.println(row + ". " + line);
                row++;
            }

            System.out.println("Lines numbered and written to: " + outputPath);

        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
