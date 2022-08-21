package Gun31.StaticModifier.Ornek2;

public class Student {
    int id;
    String name;
    String surName;

    static int sayac=0;

    public Student(String name, String surName) {
        this.id = ++sayac;
        this.name = name;
        this.surName = surName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }
}
