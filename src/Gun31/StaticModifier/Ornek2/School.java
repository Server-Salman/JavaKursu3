package Gun31.StaticModifier.Ornek2;

public class School {
    // Student (id, name, surName)
    // Yukarıdaki gibi 5 öğrenci tanımlayınız.
    // Her öğrencinin takip eden bir id si olmalı.
    // Ve en son kaç öğrenci olduğunu bulabilmeliyim.
    public static void main(String[] args) {

        Student ogr1=new Student("ismet","temur");
        Student ogr2=new Student("mehmet","temur");
        Student ogr3=new Student("zeynep","temur");

        System.out.println("ogr1 = " + ogr1);
        System.out.println("ogr2 = " + ogr2);
        System.out.println("ogr3 = " + ogr3);

        System.out.println("Öğrenci Sayısı="+Student.sayac);
    }

   // TODO: Kullanıcıya bir menu ile öğrenci ekleme, silme , arama
   // TODO: duzeltme imkanı veriniz. Öğrenci silinse bile en son
   // TODO: öğrenci sayısı doğru gözükmeli.

}
