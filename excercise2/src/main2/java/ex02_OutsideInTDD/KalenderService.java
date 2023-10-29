package ex02_OutsideInTDD;

import java.util.Date;

class KalenderService implements IKalenderService {
    public Date ToDay() {
        return new Date();
    }
}