import java.util.Random;

public class Message {
    private final String[] phrases = {"Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can’t live without this product."};
    private final String[] events = {"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};
    private final String[] authors = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
    private final String[] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

    private final Random random = new Random();

    public String randomMessage() {
        return String.format("%s %s %s - %s",
                phrases[random.nextInt(phrases.length)],
                events[random.nextInt(events.length)],
                authors[random.nextInt(authors.length)],
                cities[random.nextInt(cities.length)]);
    }
}
