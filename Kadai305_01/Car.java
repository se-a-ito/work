package Kadai305_01;

import Kadai305_01.GasolineEngine;

public class Car {
    private String carType;
    private Integer fule;
    private Integer battery;

    public String getCarType() {
        return this.carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public Car(String carType) {
        this.carType = carType;
    }

    public void driving() {
        GasolineEngine gasolineEngine = new GasolineEngine();
        Motor motor = new Motor();
        switch (getCarType()) {
            case "ガソリン車" -> {
                gasolineEngine.Refueling(100);
                Integer carRotation = gasolineEngine.rolling() * 10;
                System.out.printf("%s 燃料:%s バッテリー:%s %skm走る。%n", getCarType(), gasolineEngine.getFule(), 0, carRotation);
            }
            case "HV車" -> {
                gasolineEngine.Refueling(50);
                motor.charging(50);
                Integer hvRotation = (gasolineEngine.rolling() + motor.rolling()) * 10;
                System.out.printf("%s 燃料:%s バッテリー:%s %skm走る。%n", getCarType(), gasolineEngine.getFule(), motor.getBattery(), hvRotation);
            }
            case "EV車" -> {
                motor.charging(100);
                Integer evRotation = motor.rolling() * 10;
                System.out.printf("%s 燃料:%s バッテリー:%s %skm走る。%n", getCarType(), 0, motor.getBattery(), evRotation);
            }
        }
    }
}
