import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class VehicleCatalogue {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = "";

        List<Vehicle> vehicles = new ArrayList<>();
        while (!"End".equals(input = reader.readLine())) {
            String[] data = input.split("\\s+");
            Vehicle vehicle = new Vehicle(data[0], data[1], data[2], Integer.parseInt(data[3]));
            vehicles.add(vehicle);
        }

        String model = reader.readLine();
        while (!"Close the Catalogue".equals(model)) {
            String finalModel = model;
            vehicles
                    .stream()
                    .filter(v -> v.model().equals(finalModel))
                    .forEach(System.out::println);

            model = reader.readLine();
        }

        System.out.printf("Cars have average horsepower of: %.2f.%n",average(vehicles.stream()
                .filter(v -> v.type().equals("car"))
                .collect(Collectors.toList())));
        System.out.printf("Trucks have average horsepower of: %.2f.%n",average(vehicles.stream()
                .filter(v -> v.type().equals("truck"))
                .collect(Collectors.toList())));
    }

    private static double average(List<Vehicle> vehicles) {
        if (vehicles.isEmpty()) {
            return 0.0;
        }

        double sum = 0;

        for (Vehicle vehicle : vehicles) {
            sum += vehicle.horsepower();
        }

        return sum / vehicles.size();
    }
}
