import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class CreateZipArchive {
    public static void main(String[] args) {
        String zipFilePath = "C:\\Users\\Username\\Desktop\\zip.zip";
        String sourceFilePath = "C:\\Users\\Username\\Desktop\\text.txt";

        try (
            ZipOutputStream zip = new ZipOutputStream(new FileOutputStream(zipFilePath));
            FileInputStream fileInputStream = new FileInputStream(sourceFilePath)
        ) {
            // Add a new ZIP entry
            zip.putNextEntry(new ZipEntry("zippedFile.txt"));

            // Buffer for reading file in chunks
            byte[] buffer = new byte[4096];
            int bytesRead;

            // Write the file to the ZIP entry
            while ((bytesRead = fileInputStream.read(buffer)) != -1) {
                zip.write(buffer, 0, bytesRead);
            }

            zip.closeEntry();

            System.out.println("File successfully zipped to: " + zipFilePath);

        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
