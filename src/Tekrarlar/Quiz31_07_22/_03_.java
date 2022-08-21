package Tekrarlar.Quiz31_07_22;

public class _03_ {
    public static void main(String s[]) {
        Student ogr1 = new Student();
        Student ogr2;
        ogr2 = ogr1;
        ogr1.name = "Aslan";
        ogr2.grade = 90;
        ogr1.section = 'A';
        ogr2.name = "Kaplan";
        System.out.println("ogr1 : " + ogr1.name + " " + ogr1.grade + " " + ogr1.section);
        System.out.println("ogr2 : " + ogr2.name + " " + ogr2.grade + " " + ogr2.section);
    }
}
class Student {
    String name;
    int grade;
    char section;

}
