package de.jarai.OutsideInTDD;

import java.time.LocalDate;

class KalenderService implements IKalenderService {
    public LocalDate ToDay() {
        return  LocalDate.now();
    }
}