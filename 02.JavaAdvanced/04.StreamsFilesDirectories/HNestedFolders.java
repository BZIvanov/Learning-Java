import java.io.File;

public class HNestedFolders {
    public static void main(String[] args) {
        File f = new File("H:\\Charters Training");

        DFS(f);
    }

    static void DFS(File root) {
        if (root == null) return;

        File[] files = root.listFiles();
        if (files == null) return;

        for (File file : files) {
            if (file.isDirectory()) {
                System.out.println("DIR: " + file.getName());
                DFS(file);
            } else {
                System.out.println(file.getName());
            }
        }
    }
}
