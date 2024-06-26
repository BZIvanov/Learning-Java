import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExtractIntegers {
    public static void main(String[] args) {
        String pathIn = "D:\\input.txt";
        String pathOut = "D:\\output.txt";

        try (
                Scanner sc = new Scanner(new FileReader(pathIn));
                PrintWriter writer = new PrintWriter(pathOut)
        ) {
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
