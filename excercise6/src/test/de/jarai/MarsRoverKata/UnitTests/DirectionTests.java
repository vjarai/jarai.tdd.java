package de.jarai.MarsRoverKata.UnitTests;

import de.jarai.MarsRoverKata.Direction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class DirectionTests
{
    @Test
    public void Left_of_North_should_West()
    {
        Assertions.assertEquals(                Direction.North.LeftDirection, Direction.West);
    }

    @Test
    public void Right_of_North_should_East()
    {
        Assertions.assertEquals(Direction.North.RightDirection, Direction.East);
    }


    @Test
    public void Left_of_East_should_North()
    {
        Assertions.assertEquals(Direction.East.LeftDirection, Direction.North);
    }

    @Test
    public void Right_of_East_should_South()
    {
        Assertions.assertEquals(Direction.East.RightDirection, Direction.South);
    }


    @Test
    public void Left_of_West_should_South()
    {
        Assertions.assertEquals(Direction.West.LeftDirection, Direction.South);
    }

    @Test
    public void Right_of_West_should_North()
    {
        Assertions.assertEquals(Direction.West.RightDirection, Direction.North);
    }


    @Test
    public void Left_of_South_should_East()
    {
        Assertions.assertEquals(Direction.South.LeftDirection, Direction.East);
    }

    @Test
    public void Right_of_South_should_West()
    {
        Assertions.assertEquals(Direction.South.RightDirection, Direction.West);
    }
}