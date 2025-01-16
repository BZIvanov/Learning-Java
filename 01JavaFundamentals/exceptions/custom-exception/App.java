public class App {
    public static void main(String[] args) {
        try {
            printText("Some very long test string");
        } catch (LongTextException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Done");
    }

    private static void printText(String text) throws LongTextException {
        if (text.length() < 9) {
            System.out.println(text);
        } else {
            throw new LongTextException("The text is too long");
        }
    }
}
