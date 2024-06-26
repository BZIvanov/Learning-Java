import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class SortLines {
    public static void main(String[] args) throws IOException {
        Path pathIn = Paths.get("D:\\input.txt");
        Path pathOut = Paths.get("D:\\output.txt");

        List<String> inputLines = Files.readAllLines(pathIn)
                .parallelStream()
                .filter(s -> !s.isEmpty())
                .sorted()
                .collect(Collectors.toList());

        Files.write(pathOut, inputLines);
    }
}
