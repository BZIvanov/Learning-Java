import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class User {
    private String id;
    private String name;

    // Constructor
    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{id='" + id + "', name='" + name + "'}";
    }
}

public class PredicateExample {
    public static void main(String[] args) {
        // Sample user list
        List<User> users = new ArrayList<>();
        users.add(new User("101", "Alice"));
        users.add(new User("102", "Bob"));
        users.add(new User("103", "Charlie"));

        // ID to search for
        String id = "102";

        // Predicate to find user with matching ID
        Predicate<? super User> predicate = user -> user.getId().equals(id);

        // Using Stream API to find the first matching user
        User foundUser = users.stream()
                              .filter(predicate)
                              .findFirst()
                              .orElseThrow(() -> new RuntimeException("User not found"));

        System.out.println("Found User: " + foundUser); // Found User: User{id='102', name='Bob'}
    }
}
