package de.jarai.rover;

public record Position(int stepsEast, int stepsNorth) {

    public static final Position START = new Position(0, 0);

    public Position add(Position offsetPosition) {
        return new Position(
                stepsEast + offsetPosition.stepsEast(),
                stepsNorth + offsetPosition.stepsNorth()
        );
    }

    @Override
    public String toString() {
        return String.format("%d:%d", stepsEast, stepsNorth);
    }
}
