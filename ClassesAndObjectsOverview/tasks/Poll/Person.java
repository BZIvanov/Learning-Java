public record Person(String name, int age) {

    @Override
    public String toString() {
        return String.format("%s - %d", this.name(), this.age());
    }
}
