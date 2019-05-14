import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QExtractEmails {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();
        String regex = "\\s[A-Za-z][\\w.-]*@[A-Za-z-]+(\\.[A-Za-z]+)+";

        Pattern patt = Pattern.compile(regex);
        Matcher matcher = patt.matcher(input);

        while (matcher.find()) {
            System.out.println(matcher.group().trim());
        }
    }
}
