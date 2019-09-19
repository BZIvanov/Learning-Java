import java.io.File;

public class GListFiles {
    public static void main(String[] args) {
        File f = new File("H:\\");

        File[] allFiles = f.listFiles();
        if (allFiles == null) {
            return;
        }

        for (File f1 : allFiles) {
            if (!f1.isDirectory()) {
                System.out.println(String.format("%s: [%d]", f1.getName(), f1.length()));
            }
        }
    }
}
