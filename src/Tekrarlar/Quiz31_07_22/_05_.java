package Tekrarlar.Quiz31_07_22;

public class _05_ {
    public static void main(String s[]) {
        Car car = new Car("Toyota", "Auris", 1000, 12.4);

        System.out.println(car.company + "'s " + car.model + " has engine power of " + car.cc + "cc.");
    }
}
class Car {
    Car(String company, String model, int cc, double mileage) {
        this.company = company;
        this.model = model;
        this.cc = cc;
        this.mileage = mileage;
    }

    String company;
    String model;
    int cc;
    double mileage;
}
