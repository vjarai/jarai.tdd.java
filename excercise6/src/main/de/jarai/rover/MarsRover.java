package de.jarai.rover;

public class MarsRover {

    private Position currentPosition = new Position(0,0);
    private Direction currentDirection = NorthDirection.Instance;
    private ObstacleGrid obstacles = new ObstacleGrid();
    private boolean hasObstacle;

    public MarsRover() {
    }

    public MarsRover(ObstacleGrid obstacles) {
        this.obstacles = obstacles;
    }

    public MarsRover(Direction initialDirection) {
        currentDirection = initialDirection;
    }

    public String executeCommands(String commands) {
        hasObstacle = false;

        for (char c : commands.toCharArray()) {
            switch (c) {
                case 'M':
                    moveForward();
                    break;

                case 'L':
                    turnLeft();
                    break;

                case 'R':
                    turnRight() ;
                    break;

                default:
                    throw new IllegalArgumentException("Invalid command: " + c);
            }
        }
        return (hasObstacle ? "O:": "") + String.format("%s:%s", currentPosition.toString(), currentDirection.toString());
    }

    private void moveForward() {
        final var nextPosition = currentDirection.moveForward(currentPosition);
        hasObstacle = obstacles.hasObstacleAt(nextPosition);
        if (!hasObstacle) {
            currentPosition = nextPosition;
        }
    }

    private void turnRight() {
      currentDirection = currentDirection.turnRight();
    }

    private void turnLeft() {
        currentDirection = currentDirection.turnLeft();
    }
}
