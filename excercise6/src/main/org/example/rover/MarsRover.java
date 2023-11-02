package org.example.rover;

public class MarsRover {

    private Position currentPosition = Position.START;
    private Direction currentDirection = Direction.NORTH;

    private ObstacleGrid obstacles = new ObstacleGrid();

    public MarsRover() {
    }

    public MarsRover(ObstacleGrid obstacles) {
        this.obstacles = obstacles;
    }

    public MarsRover(Direction initialDirection) {
        currentDirection = initialDirection;
    }

    public String move(String commands) {
        var hasObstacle = false;
        for (char c : commands.toCharArray()) {
            switch (c) {
                case 'M':
                    final var nextPosition = currentDirection.getNextPosition(currentPosition);
                    hasObstacle = obstacles.hasObstacleAt(nextPosition);
                    if (!hasObstacle) {
                        currentPosition = nextPosition;
                    }
                    break;
                case 'L':
                    currentDirection = currentDirection.left;
                    break;
                case 'R':
                    currentDirection = currentDirection.right;
                    break;
                default:
            }
        }
        return (hasObstacle ? "O:": "") + String.format("%s:%s", currentPosition.toString(), currentDirection.toString());
    }
}
