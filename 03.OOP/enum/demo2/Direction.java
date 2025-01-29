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
        switch (this) {
            case NORTH: return WEST;
            case WEST: return SOUTH;
            case SOUTH: return EAST;
            case EAST: return NORTH;
        }
        return this; // This should never be reached
    }

    public Direction right() {
        switch (this) {
            case NORTH: return EAST;
            case EAST: return SOUTH;
            case SOUTH: return WEST;
            case WEST: return NORTH;
        }
        return this; // This should never be reached
    }
}
