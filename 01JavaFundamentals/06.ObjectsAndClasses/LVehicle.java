public class LVehicle {
    private String type;
    private String model;
    private String color;
    private int horsepower;

    public LVehicle(String type, String model, String color, int horsepower) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;
    }

    public String getType() {
        return this.type;
    }

    public String getModel() {
        return this.model;
    }

    public String getColor() {
        return this.color;
    }

    public int getHorsepower() {
        return this.horsepower;
    }

    @Override
    public String toString() {
        return String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %d",
                this.type.toUpperCase().charAt(0) + this.type.substring(1), this.model, this.color, this.horsepower);
    }
}
