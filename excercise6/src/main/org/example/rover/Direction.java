package org.example.rover;

public class Direction {

    public static final Direction NORTH = new Direction("N", new Position(0, 1));
    public static final Direction EAST = new Direction("E", new Position(1, 0));
    public static final Direction SOUTH = new Direction("S", new Position(0, -1));
    public static final Direction WEST = new Direction("W", new Position(-1, 0));

    static {
        NORTH.left = SOUTH.right = WEST;
        EAST.left = WEST.right = NORTH;
        SOUTH.left = NORTH.right = EAST;
        WEST.left = EAST.right = SOUTH;
    }

    private final Position offsetPosition;
    private final String name;
    public Direction left;
    public Direction right;

    @Override
    public String toString() {
        return name;
    }

    public Direction(String name, Position offsetPosition) {
        this.offsetPosition = offsetPosition;
        this.name = name;
    }

    public Position getNextPosition(Position beforePosition) {
        return beforePosition.add(offsetPosition);
    }

}
