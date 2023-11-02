package de.jarai.outside_in;

public interface IKonto {
    void Einzahlen(int einzuzahlenderBetrag);
    void Abheben(int auszuzahlenderBetrag);
    String ErstelleKontoauszug();
}