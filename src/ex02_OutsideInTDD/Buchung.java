package ex02_OutsideInTDD;

import java.util.Date;

class Buchung {
    public double Amount;
    public Date Date;

    public Buchung(double amount, Date date) {
        Amount = amount;
        Date = date;
    }

    public String ToString() {
        return "{Date} {Amount}";
    }
}