package de.jarai.MarsRoverKata;

import java.util.Objects;

public class Position {

    public int _x;
    public int _y;

    private int Max = 10;


    public  Position Add( Position rhs)
    {
        return new Position((_x + rhs._x) % Max, (_y + rhs._y) % Max);
    }


    public Position(int x, int y) {
        _x = x;
        _y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return _x == position._x && _y == position._y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(_x, _y);
    }


    public String ToString() {
        return String.format("%d:%d",_x,_y);
    }
}