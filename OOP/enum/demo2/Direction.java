public enum Direction {
    EAST("East"),
    WEST("West"),
    NORTH("North"),
    SOUTH("South");
    

    private final String name;

    Direction(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Direction left() {
        return switch (this) {
            case NORTH -> WEST;
            case WEST -> SOUTH;
            case SOUTH -> EAST;
            case EAST -> NORTH;
        };
    }

    public Direction right() {
        return switch (this) {
            case NORTH -> EAST;
            case EAST -> SOUTH;
            case SOUTH -> WEST;
            case WEST -> NORTH;
        };
    }
}
