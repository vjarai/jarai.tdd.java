package de.jarai.MarsRoverKata;

public class MarsRover {
    private Grid _grid;

    private Direction _currentDirection;

    private Position _currentPosition;


    public MarsRover() {
        this(new Grid(), new Position(0, 0), Direction.North);
    }

    public MarsRover(Grid grid, Position startPosition, Direction startDirection) {
        _grid = grid;
        _currentPosition = startPosition;
        _currentDirection = startDirection;
    }

    public String ExecuteCommands(String commands) {
        String result = "";

        for (char command : commands.toCharArray()) {
            boolean obstacleDetected = false;

            switch (command) {

                case 'M':
                    // Move one Step
                    var nextPosition = CalculateNextPosition();

                    obstacleDetected = _grid.HasObstacle(nextPosition);

                    if (!obstacleDetected)
                        _currentPosition = nextPosition;

                    break;

                case 'L':
                    // Turn Left
                    _currentDirection = _currentDirection.LeftDirection;
                    break;

                case 'R':
                    // Turn Right
                    _currentDirection = _currentDirection.RightDirection;
                    break;

                default:
                    //throw new Exception("Unknown command: {command}");
            }

            result =  (obstacleDetected? "O": ":" ) + "{_currentPosition}:{_currentDirection}";

        }

        return result;
    }

    public Position CalculateNextPosition() {

        return _currentPosition.Add( _currentDirection.NextPositionOffset);
    }
}