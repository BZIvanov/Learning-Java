import java.io.*;

public class LineNumbers {
    public static void main(String[] args) throws IOException {
        String filePath = "D:\\input.txt";
        String outputPath = "D:\\output.txt";

        BufferedReader reader = new BufferedReader(new FileReader(filePath));

        StringBuilder outputLine = new StringBuilder();
        String line = reader.readLine();
        int row = 1;
        while (line != null) {
            outputLine.append(row).append(". ").append(line);
            outputLine.append(System.lineSeparator());

            row++;
            line = reader.readLine();
        }

        PrintWriter printer = new PrintWriter(outputPath);
        printer.println(outputLine);
        printer.close();
    }
}
