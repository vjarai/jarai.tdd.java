package de.jarai.outside_in;

import java.time.format.DateTimeFormatter;
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
            result += String.format( "%s  %s  %s\n",  buchung.Date.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")), buchung.Amount, saldo);
        }

        return result;
    }
}