package Kadai305_01;

public final class Main {
    public static void main(String[] args) {
        Car[] car = { new Car("ガソリン車"),new Car("EV車"),new Car("HV車")};
        for (Car cars: car) {
            cars.driving();
        }
    }
}
