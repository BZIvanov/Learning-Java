import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
    public static void main(String[] args) {
        String pathIn = "D:\\input.txt";
        String pathOut = "D:\\output.txt";

        try (
                FileInputStream fis = new FileInputStream(pathIn);
                FileOutputStream fos = new FileOutputStream(pathOut)
        ) {
            int oneByte = fis.read();
            while (oneByte >= 0) {
                if (oneByte == 32 || oneByte == 10) {
                    fos.write(oneByte);
                } else {
                    String byteAsText = String.valueOf(oneByte);
                    for (int i = 0; i < byteAsText.length(); i++) {
                        int symbol = byteAsText.charAt(i);
                        fos.write(symbol);
                    }
                }

                oneByte = fis.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
