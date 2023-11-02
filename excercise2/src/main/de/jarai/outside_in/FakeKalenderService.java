package de.jarai.outside_in;

import java.time.LocalDate;

public class FakeKalenderService implements IKalenderService {
    public LocalDate ToDay() {
        return  LocalDate.parse("2023-01-01");
    }
}