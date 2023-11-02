package de.jarai.outside_in;

import java.time.LocalDate;

class KalenderService implements IKalenderService {
    public LocalDate ToDay() {
        return  LocalDate.now();
    }
}