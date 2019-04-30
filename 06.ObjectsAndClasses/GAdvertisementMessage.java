import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GAdvertisementMessage {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        GMessage message = new GMessage();
        for (int i = 0; i < n; i++) {
            String msg = message.randomMessage();
            System.out.println(msg);
        }
    }
}
