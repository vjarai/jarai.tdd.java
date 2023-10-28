package ex02_OutsideInTDD;

import java.util.ArrayList;

public class Konto implements IKonto {
    private ArrayList<Buchung> _buchungen = new ArrayList<Buchung>();

    private IKalenderService _kalenderService;


    public Konto(IKalenderService kalenderService) {
        _kalenderService = kalenderService;
    }

    public void Einzahlen(int einzuzahlenderBetrag) {
        _buchungen.add(new Buchung(einzuzahlenderBetrag, _kalenderService.ToDay()));
    }

    public void Abheben(int auszuzahlenderBetrag) {
        _buchungen.add(new Buchung(-auszuzahlenderBetrag, _kalenderService.ToDay()));
    }

    public String ErstelleKontoauszug() {
        double saldo = 0;
        var result = "Datum         Betrag     Saldo\n";


        for (Buchung buchung : _buchungen) {
            saldo += buchung.Amount;
            result += "{buchung.Date:d}  {buchung.Amount,8:F2}  {saldo,8:F2}\n";
        }

        return result;
    }
}