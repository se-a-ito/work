package Kadai305_01;

import Kadai305_01.RollingPower;

public class Motor implements RollingPower {
    private Integer battery;

    public Integer getBattery() {
        return  this.battery;
    }

    public void charging(Integer battery) {
        this.battery = battery;
    }

    public Integer rolling() {
        return getBattery() * 500;
    }
}
