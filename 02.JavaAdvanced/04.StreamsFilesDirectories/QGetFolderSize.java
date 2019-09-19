import java.io.File;
import java.util.Arrays;

public class QGetFolderSize {
    public static void main(String[] args) {
        File file = new File("H:\\Exercises Resources");

        long sum = Arrays.stream(file.listFiles())
                .filter(e -> !e.isDirectory())
                .mapToLong(File::length)
                .sum();

        System.out.println("Folder size: " + sum);
    }
}
