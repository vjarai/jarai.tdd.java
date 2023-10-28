package ex02_OutsideInTDD;
import java.util.Date;

class Buchung
{
    public Buchung(double amount, Date date)
    {
        Amount = amount;
        Date = date;
    }

    public double Amount;

    public Date Date ;

    public  String ToString()
    {
        return "{Date} {Amount}";
    }
}