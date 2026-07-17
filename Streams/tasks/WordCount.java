import java.io.*;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) throws IOException {
        String textInput = "C:\\Users\\Username\\Desktop\\text.txt";
        String wordsInput = "C:\\Users\\Username\\Desktop\\words.txt";
        String resultOutput = "C:\\Users\\Username\\Desktop\\result.txt";

        Map<String, Integer> words = new LinkedHashMap<>();

        try (
            BufferedReader textReader = new BufferedReader(new InputStreamReader(new FileInputStream(new File(textInput))));
            BufferedReader wordsReader = new BufferedReader(new InputStreamReader(new FileInputStream(new File(wordsInput))));
            PrintWriter out = new PrintWriter(new FileWriter(resultOutput))
        ) {
            String line;

            while ((line = wordsReader.readLine()) != null) {
                Arrays.stream(line.trim().split("\\s+")).forEach(word -> {
                    words.putIfAbsent(word, 0);
                });
            }

            while ((line = textReader.readLine()) != null) {
                String[] tokens = line.split("\\s+");
                for (String word : tokens) {
                    if (words.containsKey(word)) {
                        words.put(word, words.get(word) + 1);
                    }
                }
            }

            words.entrySet()
                    .stream()
                    .sorted((a, b) -> Integer.compare(b.getValue(), a.getValue()))
                    .forEach(entry -> {
                        out.println(String.format("%s - %d", entry.getKey(), entry.getValue()));
                    });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
