import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Articles {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] data = reader.readLine().split(", ");
        int n = Integer.parseInt(reader.readLine());

        // we don't need to import this class in this example, because it is within the same package
        Article article = new Article(data[0], data[1], data[2]);

        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split(": ");
            String command = input[0];

            switch (command) {
                case "Edit":
                    article.edit(input[1]);
                    break;
                case "ChangeAuthor":
                    article.changeAuthor(input[1]);
                    break;
                case "Rename":
                    article.rename(input[1]);
                    break;
            }
        }

        System.out.println(article);
    }
}
