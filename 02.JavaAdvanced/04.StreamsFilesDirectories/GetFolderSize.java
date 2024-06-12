import java.io.File;
import java.util.Arrays;

public class GetFolderSize {
    public static void main(String[] args) {
        File file = new File("D:\\test");

        long sum = Arrays.stream(Objects.requireNonNull(file.listFiles()))
                .filter(e -> !e.isDirectory())
                .mapToLong(File::length)
                .sum();

        System.out.println("Folder size: " + sum);
    }
}
