package Mentoring._130622.ClassJava;

public class Person {
    String id;
    String name;
    String surname;

    @Override // ileride ne olduğunu görücez
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
