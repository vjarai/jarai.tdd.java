package ex02_OutsideInTDD;

import java.util.Date;

public class FakeKalenderService implements IKalenderService {
    public Date ToDay() {
        return new Date(2023, 1, 1);
    }
}