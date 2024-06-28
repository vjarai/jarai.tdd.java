package de.jarai.rover;

public class NorthDirection extends Direction {

    static NorthDirection Instance = new NorthDirection();

    public NorthDirection() {
        super("N");
    }

    @Override
    public Position moveForward(Position currentPosition) {
        return new Position(currentPosition.getX(), currentPosition.getY() + 1);
    }

    @Override
    public Direction turnLeft() {
        return WestDirection.Instance;
    }

    @Override
    public Direction turnRight() {
        return EastDirection.Instance;
    }
}
