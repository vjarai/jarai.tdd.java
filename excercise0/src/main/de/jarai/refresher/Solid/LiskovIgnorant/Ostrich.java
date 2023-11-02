package de.jarai.refresher.Solid.LiskovIgnorant;

public class Ostrich extends Bird {
    public void Fly() {
        throw new RuntimeException();
    }

    public void Walk() {
        System.out.println("walk");
    }
}