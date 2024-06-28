package de.jarai.rover;

public class WestDirection extends Direction {

    static WestDirection Instance = new WestDirection();

    public WestDirection() {
        super("W");
    }

    @Override
    public Position moveForward(Position currentPosition) {
        return new Position(currentPosition.getX()-1, currentPosition.getY() );
    }

    @Override
    public Direction turnLeft() {
        return SouthDirection.Instance;
    }

    @Override
    public Direction turnRight() {
        return NorthDirection.Instance;
    }
}
