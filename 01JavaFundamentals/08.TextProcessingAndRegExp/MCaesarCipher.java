import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MCaesarCipher {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String text = reader.readLine();

        for (int i = 0; i < text.length(); i++) {
            char letterUp = text.charAt(i);
            System.out.print((char)(letterUp + 3));
        }
    }
}
