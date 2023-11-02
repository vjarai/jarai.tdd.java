package de.jarai.outside_in;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.lang.String.format;

public class Account {

    private final List<Booking> bookings = new ArrayList<>();
    private final ICalendarService calendarService;

    public Account(ICalendarService calendarService) {
        this.calendarService = calendarService;
    }

    public void deposit(int amountToDeposit) {
        throwIfNegativeAmount(amountToDeposit);
        bookings.add(new Booking(calendarService.getToday(), amountToDeposit));
    }

    public void withdraw(int amountToWithdraw) {
        throwIfNegativeAmount(amountToWithdraw);
        bookings.add(new Booking(calendarService.getToday(), -amountToWithdraw));
    }

    private static void throwIfNegativeAmount(int amountToWithdraw) {
        if (amountToWithdraw < 0) {
            throw new InvalidAccountOperationException();
        }
    }

    public int currentBalance() {
        return bookings
                .stream()
                .map(Booking::amount)
                .mapToInt(Integer::intValue)
                .sum();
    }

    public Stream<Booking> getBookings() {
        return bookings.stream();
    }

    private static final String HEADER = "Datum\tBetrag\tSaldo\n";
    private static final String BOOKING_FORMAT = "%s\t%s,00\t%s,00\n";

    public String printStatement() {
        var saldo = 0;
        final var sb = new StringBuilder();
        sb.append(HEADER);
        for(Booking b:bookings) {
            sb.append(format(BOOKING_FORMAT, formatDate(b.bookingDate()), b.amount(), saldo+= b.amount()));
        }

        return sb.toString();
    }

    private static String formatDate(LocalDate date) {
        return DateTimeFormatter.ofPattern("dd.MM.yyyy").format(date);
    }

}
