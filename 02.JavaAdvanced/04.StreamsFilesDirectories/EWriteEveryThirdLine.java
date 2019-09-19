import java.io.*;

public class EWriteEveryThirdLine {
    public static void main(String[] args) {
        String pathIn = "H:\\input.txt";
        String pathOut = "H:\\output.txt";

        int pos = 1;
        try (BufferedReader bfr = new BufferedReader(new FileReader(pathIn));
             BufferedWriter bfw = new BufferedWriter(new PrintWriter(pathOut))) {

            String line = "";
            while ((line = bfr.readLine()) != null) {
                if (pos % 3 == 0) {
                    bfw.write(line);
                    bfw.newLine();
                }
                pos++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
