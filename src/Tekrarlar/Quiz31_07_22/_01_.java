package Tekrarlar.Quiz31_07_22;

public class _01_ {
    public static void main(String s[]) {
        Student1 Ahmet = new Student1();
        System.out.println("Name = " + Ahmet.name);
        System.out.println("Grade = " + Ahmet.grade);
        System.out.println("Section = " + Ahmet.section);
        Student1 Ayse = new Student1();
        System.out.println("Name = " + Ayse.name);
        System.out.println("Grade = " + Ayse.grade);
        System.out.println("Section = " + Ayse.section);
    }
}
class Student1 {
    String name = "Ayse";
    int grade = 76;
    char section = 'A';
}
