package de.jarai.rover;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


    public class DirectionTests
    {
        @Test
        public void Given_NorthDirection_when_TurnLeft_then_WestDirection()
        {
            // Arrange
            var sut = NorthDirection.Instance;

            // Act
            var actual = sut.turnLeft();

            // Assert
            assertEquals(WestDirection.Instance, actual);
        }

        @Test
        public void Given_NorthDirection_when_TurnRight_then_EastDirection()
        {
            // Arrange
            var sut = NorthDirection.Instance;

            // Act
            var actual = sut.turnRight();

            // Assert
            assertEquals(EastDirection.Instance, actual);
        }


        @Test
        public void Given_EastDirection_when_TurnLeft_then_NorthDirection()
        {
            // Arrange
            var sut = EastDirection.Instance;

            // Act
            var actual = sut.turnLeft();

            // Assert
            assertEquals(NorthDirection.Instance, actual);
        }

        @Test
        public void Given_EastDirection_when_TurnRight_then_SouthDirection()
        {
            // Arrange
            var sut = EastDirection.Instance;

            // Act
            var actual = sut.turnRight();

            // Assert
            assertEquals(SouthDirection.Instance, actual);
        }


        @Test
        public void Given_WestDirection_when_TurnLeft_then_SouthDirection()
        {
            // Arrange
            var sut = WestDirection.Instance;

            // Act
            var actual = sut.turnLeft();

            // Assert
            assertEquals(SouthDirection.Instance, actual);
        }

        @Test
        public void Given_WestDirection_when_TurnRight_then_NorthDirection()
        {
            // Arrange
            var sut = WestDirection.Instance;

            // Act
            var actual = sut.turnRight();

            // Assert
            assertEquals(NorthDirection.Instance, actual);
        }


        @Test
        public void Given_SouthDirection_when_TurnLeft_then_EastDirection()
        {
            // Arrange
            var sut = SouthDirection.Instance;

            // Act
            var actual = sut.turnLeft();

            // Assert
            assertEquals(EastDirection.Instance, actual);
        }

        @Test
        public void Given_SouthDirection_when_TurnRight_then_WestDirection()
        {
            // Arrange
            var sut = SouthDirection.Instance;

            // Act
            var actual = sut.turnRight();

            // Assert
            assertEquals(WestDirection.Instance, actual);
        }
    }


