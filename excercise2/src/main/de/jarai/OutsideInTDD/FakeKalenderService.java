package de.jarai.OutsideInTDD;

import java.time.LocalDate;

public class FakeKalenderService implements IKalenderService {
    public LocalDate ToDay() {
        return  LocalDate.parse("2023-01-01");
    }
}