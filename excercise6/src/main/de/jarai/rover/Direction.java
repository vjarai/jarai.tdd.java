package de.jarai.rover;

public abstract class Direction {


    private final String name;

    @Override
    public String toString() {
        return name;
    }

    public Direction(String name) {
        this.name = name;
    }

    public abstract Position moveForward(Position currentPosition);

    public abstract Direction turnLeft();

    public abstract Direction turnRight();

}
