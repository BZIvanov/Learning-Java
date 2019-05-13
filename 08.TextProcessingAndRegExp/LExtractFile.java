import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LExtractFile {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String dir = reader.readLine();

        String fileName = dir.substring(dir.lastIndexOf('\\') +1);
        String name = fileName.substring(0, fileName.lastIndexOf('.'));
        String extension = fileName.substring(fileName.lastIndexOf('.') + 1);

        System.out.println(String.format("File name: %s", name));
        System.out.println(String.format("File extension: %s", extension));
    }
}
