import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class RCopyPicture {
    public static void main(String[] args) throws IOException {
        String filePath = "H:\\Emiiter.PNG";

        FileInputStream inputStream = new FileInputStream(filePath);

        byte[] image = inputStream.readAllBytes();

        FileOutputStream outputStream = new FileOutputStream("H:\\clone.PNG");

        outputStream.write(image);
        outputStream.close();
    }
}
