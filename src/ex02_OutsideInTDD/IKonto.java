package ex02_OutsideInTDD;

public interface IKonto
{
     void Einzahlen(int einzuzahlenderBetrag);

     void Abheben(int auszuzahlenderBetrag);

     String ErstelleKontoauszug();
}