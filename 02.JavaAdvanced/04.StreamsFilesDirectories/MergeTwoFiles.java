// with * we will import everything from java.io
import java.io.*;

public class MergeTwoFiles {
    public static void main(String[] args) {
        String inputOne = "D:\\inputOne.txt";
        String inputTwo = "D:\\inputTwo.txt";
        String resultOutput = "D:\\result.txt";

        try (
                BufferedReader first = new BufferedReader(new InputStreamReader(new FileInputStream(new File(inputOne))));
                BufferedReader second = new BufferedReader(new InputStreamReader(new FileInputStream(new File(inputTwo))));
                PrintWriter out = new PrintWriter(new FileWriter(resultOutput))
        ) {
            String line;

            while ((line = first.readLine()) != null) {
                out.println(line);
            }

            while ((line = second.readLine()) != null) {
                out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
