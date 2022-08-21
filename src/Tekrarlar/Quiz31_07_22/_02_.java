package Tekrarlar.Quiz31_07_22;

public class _02_ {
    public static void main(String s[]) {
        Bike altus = new Bike();
        altus.company = "Bisan";
        altus.model = "Altus";
        altus.mileage = 72.5;

        System.out.println(altus.company + "'s " + altus.model + " gives a mileage of " + altus.mileage + "kmpl.");

        Bike montana = altus;
        montana.company = "Umit";
        montana.model = "Montana";
        montana.mileage = 55.2;
        montana.diskBrakes = true;

        System.out.println(montana.company + "'s " + montana.model + " gives a mileage of " + montana.mileage + "kmpl.");
    }
}
class Bike {
    String company;
    String model;
    int cc;
    double mileage;
    boolean diskBrakes;
}
