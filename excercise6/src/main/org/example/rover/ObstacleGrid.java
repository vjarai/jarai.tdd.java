package org.example.rover;

import java.util.HashSet;
import java.util.Set;

public class ObstacleGrid {

    private final Set<Position> obstacles = new HashSet<>();

    public void addObstacle(Position position) {
        obstacles.add(position);
    }

    public boolean hasObstacleAt(Position position) {
        return obstacles.contains(position);
    }
}
