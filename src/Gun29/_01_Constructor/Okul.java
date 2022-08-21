package Gun29._01_Constructor;

public class Okul {
    // Bir Student sınıfı oluşturunuz
    // (id(int), name, surName, classroom(int)) ve
    // bundan 3 adet öğrenci oluşturunuz.

    public static void main(String[] args) {
        // 1.Yöntem
        Student ogr1=new Student(); // () parametre yeri
        ogr1.id=1;
        ogr1.name="Ali Kemal";
        ogr1.surName="Inal";
        ogr1.classroom=11;
        System.out.println("ogr1 = " + ogr1.name);

        Student ogr2=new Student(); // () parametre yeri
        ogr2.id=2;
        ogr2.name="Metin";
        ogr2.surName="Haşal";
        ogr2.classroom=12;
        System.out.println("ogr2.name = " + ogr2.name);

        //2.Yöntem
        Student ogr3=new Student(3,"Yasin","Erkol",9);
        System.out.println("ogr3.name = " + ogr3.name);

        Student ogr4=new Student(4,"Yasin","Erkol",9);
        Student ogr5=new Student(5,"Murat","Erkol");
        Student ogr6=new Student(6,"Murat");
        Student ogr7=new Student(7);


    }
}
