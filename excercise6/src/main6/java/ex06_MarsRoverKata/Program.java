package ex06_MarsRoverKata;

public class Program {
    public static void Main(String[] args) throws Exception {
        var grid = new Grid();
        grid.AddObstacle(new Position(0, 4));

        var marsRover = new MarsRover(grid, new Position(0, 0), Direction.North);

        marsRover.ExecuteCommands("MMMMRMLMMLMRM");

    }
}