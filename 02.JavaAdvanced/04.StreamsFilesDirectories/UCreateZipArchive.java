import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class UCreateZipArchive {
    public static void main(String[] args) throws IOException {
        // this is where our file will be saved
        ZipOutputStream zip = new ZipOutputStream(new FileOutputStream("H:\\Exercises Resources\\zip.zip"));

        // this is what we are going to zip
        FileInputStream fileInputStream = new FileInputStream("H:\\Exercises Resources\\inputLineNumbers.txt");

        // this will be the name for the file in the zip
        zip.putNextEntry(new ZipEntry("zippedFile.txt"));
        zip.write(fileInputStream.readAllBytes());
        zip.close();
    }
}
