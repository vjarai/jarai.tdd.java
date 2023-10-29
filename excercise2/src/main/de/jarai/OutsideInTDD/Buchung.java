package de.jarai.OutsideInTDD;

import java.time.LocalDate;

class Buchung {
    public double Amount;
    public LocalDate Date;

    public Buchung(double amount, LocalDate date) {
        Amount = amount;
        Date = date;
    }

    public String ToString() {
        return "{Date} {Amount}";
    }
}