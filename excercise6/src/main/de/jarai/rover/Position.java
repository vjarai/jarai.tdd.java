package de.jarai.rover;

import java.util.Objects;

public class Position
{
    private final int X;
    private final int Y;

    public Position(int x, int y)
     {
         this.X = x % 10;
         this.Y = y % 10;
     }

     public int getX()
     {
         return X;
     }

     public int getY()
     {
         return Y;
     }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Position position)) return false;
        return X == position.X && Y == position.Y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(X, Y);
    }

    @Override
    public String toString() {
        return String.format("%d:%d", X, Y);
    }
}
