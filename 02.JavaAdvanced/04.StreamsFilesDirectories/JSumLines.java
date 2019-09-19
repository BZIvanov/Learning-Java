import java.io.*;

public class JSumLines {
    public static void main(String[] args) throws IOException {
        String filePath = "H:\\input.txt";
        String outFile = "H:\\output.txt";

        FileWriter writer = new FileWriter(outFile);
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line = reader.readLine();
            while (line != null) {
                int asciiSum = 0;
                for (char symbol : line.toCharArray()) {
                    asciiSum += symbol;
                }

                writer.write(asciiSum + "");
                writer.write(System.lineSeparator());
                line = reader.readLine();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        writer.close();
    }
}
