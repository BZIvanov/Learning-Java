import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyPicture {
    public static void main(String[] args) throws IOException {
        String filePath = "C:\\my-image.png";
        String outputPath = "C:\\my-cloned-image.png";

        // Try-with-resources for automatic resource management
        try (
            FileInputStream inputStream = new FileInputStream(filePath);
            FileOutputStream outputStream = new FileOutputStream(outputPath)
        ) {
            // Buffer for reading chunks of data
            byte[] buffer = new byte[4096];
            int bytesRead;

            // Read and write in chunks
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            System.out.println("Image copied successfully!");

        } catch (IOException e) {
            System.err.println("An error occurred during the file operation: " + e.getMessage());
        }
    }
}
