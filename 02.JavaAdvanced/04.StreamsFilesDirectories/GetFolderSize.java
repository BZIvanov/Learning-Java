import java.io.File;
import java.util.Arrays;
import java.util.Objects;

public class GetFolderSize {
    public static void main(String[] args) {
        File folder = new File("C:\\Users\\Username\\Desktop\\test");

        if (!folder.exists() || !folder.isDirectory()) {
            System.out.println("The specified path is not a directory or does not exist.");
            return;
        }

        long totalSize = calculateFolderSize(folder);
        System.out.println("Folder size: " + totalSize + " bytes");
    }

    private static long calculateFolderSize(File folder) {
        return Arrays.stream(Objects.requireNonNull(folder.listFiles()))
                .mapToLong(file -> {
                    if (file.isDirectory()) {
                        // Recursively calculate size for subdirectories
                        return calculateFolderSize(file);
                    } else {
                        return file.length();
                    }
                })
                .sum();
    }
}
