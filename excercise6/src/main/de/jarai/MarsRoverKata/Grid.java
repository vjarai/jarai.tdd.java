package de.jarai.MarsRoverKata;

import java.util.ArrayList;

public class Grid {
    private ArrayList<Position> _obstaclePositions = new ArrayList<>();

    public void AddObstacle(Position obstaclePosition) {
        _obstaclePositions.add(obstaclePosition);
    }

    public boolean HasObstacle(Position position) {
        for (var obstacle : _obstaclePositions) {
            if (obstacle._x == position._x && obstacle._y == position._y) {
                return true;
            }
        }

        return false;
    }
}