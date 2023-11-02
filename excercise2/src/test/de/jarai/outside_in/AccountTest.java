package de.jarai.outside_in;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mockito;

import java.time.LocalDate;

import static org.approvaltests.Approvals.verify;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

public class AccountTest {

    private Account sut;

    @BeforeEach
    void setUp() {
        final var calendarService = Mockito.mock(ICalendarService.class);
        when(calendarService.getToday()).thenReturn(LocalDate.of(2023, 1, 1));
        sut = new Account(calendarService);
    }

    @Test
    void whenPrintStatement_GivenADepositAndAWithdraw_ThenPrintAStatement() {
        // given / arrange
        sut.deposit(100);
        sut.withdraw(50);

        // when / act
        final var statement = sut.printStatement();

        // then / assert
        verify(statement);
    }

    @Test
    void whenNewAccount_GivenNoFurtherAction_ThenBalanceIsZero() {
        // given / arrange

        // when / act

        // then / assert
        assertEquals(0, sut.currentBalance());
    }

    @ParameterizedTest
    @ValueSource(ints = {100, 200})
    void whenNewAccount_GivenADeposit_ThenBalanceEqualsDeposit(int deposit) {
        // given / arrange

        // when / act
        sut.deposit(deposit);

        // then / assert
        assertEquals(deposit, sut.currentBalance());
    }

    @ParameterizedTest
    @CsvSource({"100,200,300", "40,25,65"})
    void whenNewAccount_GivenTwoDeposits_ThenBalanceEqualsSumOfDeposits(
            int deposit1, int deposit2, int expected) {
        // given / arrange
        sut.deposit(deposit1);
        sut.deposit(deposit2);

        // when / act
        final var actual = sut.currentBalance();

        // then / assert
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {-100, -200})
    void whenNewAccount_GivenANegativeDeposit_ThenThrowsInvalidAccountOperationException(int deposit) {
        // given / arrange

        // when / act
        // then / assert
        assertThrows(InvalidAccountOperationException.class, () -> sut.deposit(deposit));
    }

    @ParameterizedTest
    @ValueSource(ints = {50, 100, 200})
    void whenNewAccount_GivenAWithdraw_ThenBalanceEqualsNegativeWithdraw(int withdraw) {
        // given / arrange

        // when / act
        sut.withdraw(withdraw);

        // then / assert
        assertEquals(-withdraw, sut.currentBalance());
    }

    @ParameterizedTest
    @CsvSource({"100,200,-300", "40,25,-65"})
    void whenNewAccount_GivenTwoWithdraws_ThenBalanceEqualsSumOfNegativeWithdraws(
            int withdraw1, int withdraw2, int expected) {
        // given / arrange
        sut.withdraw(withdraw1);
        sut.withdraw(withdraw2);

        // when / act
        final var actual = sut.currentBalance();

        // then / assert
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {-50, -100, -200})
    void whenNewAccount_GivenANegativeWithdraw_ThenThrowsInvalidAccountOperationException(int withdraw) {
        // given / arrange

        // when / act
        // then / assert
        assertThrows(InvalidAccountOperationException.class, () -> sut.withdraw(withdraw));
    }

    @Test
    void whenNewAccount_GivenTwoBookings_ThenGetBookingsReturnTwoBookings() {
        // given / arrange
        sut.deposit(100);
        sut.withdraw(50);

        // when / act
        final var bookings = sut.getBookings();

        // then / assert
        assertEquals(2, bookings.count());
    }


}
