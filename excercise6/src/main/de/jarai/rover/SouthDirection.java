package de.jarai.rover;

public class SouthDirection extends Direction {

    static SouthDirection Instance = new SouthDirection();

    public SouthDirection() {
        super("S");
    }

    @Override
    public Position moveForward(Position currentPosition) {
        return new Position(currentPosition.getX(), currentPosition.getY() - 1);
    }

    @Override
    public Direction turnLeft() {
        return EastDirection.Instance;
    }

    @Override
    public Direction turnRight() {
        return WestDirection.Instance;
    }
}
