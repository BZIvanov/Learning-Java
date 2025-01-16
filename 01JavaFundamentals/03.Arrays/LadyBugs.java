import java.util.Scanner;

public class LadyBugs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fieldSize = Integer.parseInt(sc.nextLine());

        String[] indexes = sc.nextLine().split(" ");

        int[] field = new int[fieldSize];

        for (String s : indexes) {
            int index = Integer.parseInt(s);
            if (index >= 0 && index < fieldSize) {
                field[index] = 1;
            }
        }
        String command = sc.nextLine();

        while (!command.equals("end")) {
            String[] cmdArgs = command.split(" ");
            int index = Integer.parseInt(cmdArgs[0]);
            String cmd = cmdArgs[1];
            int flyLength = Integer.parseInt(cmdArgs[2]);

            if (index < 0 || index > fieldSize - 1 || field[index] == 0) {
                command = sc.nextLine();
                continue;
            }

            field[index] = 0;
            if (cmd.equals("right")) {
                index += flyLength;

                while (index < fieldSize && field[index] == 1) {
                    index += flyLength;
                }
                if (index < fieldSize) {
                    field[index] = 1;
                }
            } else {
                index -= flyLength;

                while (index >= 0 && field[index] == 1) {
                    index -= flyLength;
                }
                if (index >= 0) {
                    field[index] = 1;
                }
            }

            command = sc.nextLine();
        }

        for (int j : field) {
            System.out.print(j + " ");
        }

        sc.close();
    }
}
