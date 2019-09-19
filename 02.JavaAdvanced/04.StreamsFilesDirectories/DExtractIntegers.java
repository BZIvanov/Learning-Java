import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class DExtractIntegers {
    public static void main(String[] args) {
        String pathIn = "H:\\input.txt";
        String pathOut = "H:\\output.txt";


        try (Scanner sc = new Scanner(new FileReader(pathIn));
             PrintWriter writer = new PrintWriter(pathOut)) {
            while (sc.hasNext()) {
                sc.next();
                if (sc.hasNextInt()) {
                    writer.println(sc.nextInt());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
