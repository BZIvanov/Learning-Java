public record Vehicle(String type, String model, String color, int horsepower) {

    @Override
    public String toString() {
        return String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %d",
                this.type.toUpperCase().charAt(0) + this.type.substring(1), this.model, this.color, this.horsepower);
    }
}
