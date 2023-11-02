package de.jarai.patterns.adapter;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.verify;

public class ApplePhoneTests {

    @Test
    void givenApplePhone_whenChargeWithUsbToAppleChargerAdapter_thenUsbChargerChargeViaUSBIsCalled() {
        // given
        final var mockedUsbCharger = Mockito.mock(UsbCharger.class);
        final var appleCharger = new UsbToAppleChagerAdapter(mockedUsbCharger);
        final var applePhone = new ApplePhone();

        // when
        applePhone.charge(appleCharger);

        // then
        verify(mockedUsbCharger).chargeViaUsb();
    }

}
