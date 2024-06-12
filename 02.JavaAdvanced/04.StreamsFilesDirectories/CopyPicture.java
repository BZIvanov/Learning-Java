import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyPicture {
    public static void main(String[] args) throws IOException {
        String filePath = "D:\\my-image.png";

        FileInputStream inputStream = new FileInputStream(filePath);

        byte[] image = inputStream.readAllBytes();

        FileOutputStream outputStream = new FileOutputStream("D:\\my-cloned-image.png");

        outputStream.write(image);
        outputStream.close();
    }
}
