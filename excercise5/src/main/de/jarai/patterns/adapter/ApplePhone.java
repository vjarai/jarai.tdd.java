package de.jarai.patterns.adapter;

public class ApplePhone {
    public void charge(AppleCharger appleCharger) {
        appleCharger.chargeViaLigthning();
    }
}
