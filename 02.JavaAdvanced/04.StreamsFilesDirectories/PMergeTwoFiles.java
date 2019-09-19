import java.io.*;

public class PMergeTwoFiles {
    public static void main(String[] args) {
        String inputOne = "H:\\Exercises Resources\\inputOne.txt";
        String inputTwo = "H:\\Exercises Resources\\inputTwo.txt";
        String resultOutput = "H:\\result.txt";

        try (BufferedReader first = new BufferedReader(new InputStreamReader(new FileInputStream(new File(inputOne))));
             BufferedReader second = new BufferedReader(new InputStreamReader(new FileInputStream(new File(inputTwo))));
             PrintWriter out = new PrintWriter(new FileWriter(resultOutput))) {
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
