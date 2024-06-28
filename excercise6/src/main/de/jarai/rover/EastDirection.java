package de.jarai.rover;

public class EastDirection extends Direction {

    static EastDirection Instance = new EastDirection();

    public EastDirection() {
        super("E");
    }

    @Override
    public Position moveForward(Position currentPosition) {
        return new Position(currentPosition.getX()+1, currentPosition.getY() );
    }

    @Override
    public Direction turnLeft() {
        return NorthDirection.Instance;
    }

    @Override
    public Direction turnRight() {
        return SouthDirection.Instance;
    }
}
