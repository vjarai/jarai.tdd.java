package org.example.adapter_pattern.model;

public class UsbToAppleChagerAdapter extends AppleCharger {

    private final UsbCharger usbCharger;

    public UsbToAppleChagerAdapter(UsbCharger usbCharger) {
        this.usbCharger = usbCharger;
    }

    @Override
    public void chargeViaLigthning() {
        usbCharger.chargeViaUsb();
    }
}
