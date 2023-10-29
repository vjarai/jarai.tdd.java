package de.jarai.OutsideInTDD;

public interface IKonto {
    void Einzahlen(int einzuzahlenderBetrag);
    void Abheben(int auszuzahlenderBetrag);
    String ErstelleKontoauszug();
}