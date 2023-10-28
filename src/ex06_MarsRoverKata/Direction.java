package ex06_MarsRoverKata;

public class Direction {
    public static Direction North;
    public static Direction South;
    public static Direction East;
    public static Direction West;

    static {
        var north = new Direction(new Position(0, 1), "N");
        var south = new Direction(new Position(0, -1), "S");
        var east = new Direction(new Position(1, 0), "E");
        var west = new Direction(new Position(-1, 0), "W");

        north.RightDirection = south.LeftDirection = east;
        north.LeftDirection = south.RightDirection = west;
        east.RightDirection = west.LeftDirection = south;
        east.LeftDirection = west.RightDirection = north;

        North = north;
        South = south;
        East = east;
        West = west;

    }

    public Position NextPositionOffset;
    public Direction LeftDirection;
    public Direction RightDirection;
    private String _kompassDirection;

    public Direction(Position nextPositionOffset, String kompassDirection) {
        NextPositionOffset = nextPositionOffset;
        _kompassDirection = kompassDirection;
    }

    public String ToString() {

        return _kompassDirection;
    }
}