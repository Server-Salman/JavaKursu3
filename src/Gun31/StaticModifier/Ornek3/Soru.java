package Gun31.StaticModifier.Ornek3;

public class Soru {
    int a; // nesneye

    static int b=0;  // sen bi tanesin

    void artir(){
        a++;
        b++;
    }


    public static void main(String[] args) {
        Soru s1=new Soru();
        s1.a=5;  // bu degısken nesneye aıt nesne oluşturmadan ulaşamam

        Soru s2=new Soru();
        s2.a=7;

        // a nın değeri kaç oldu şu anda : Burada verilecek cevap hangi a yı soruyorsunuz olmalı.

        System.out.println("s1.a = " + s1.a); // 5
        System.out.println("s2.a = " + s2.a); // 7

        Soru.b  = 6;  // Class a it direk Class ın ismi ile ulaşabilirim.
        Soru.b = 8;

        // Soru b nin değeri kaçtır :  tek bir değeri vardır en son deger
        System.out.println("Soru.b = " + Soru.b); // 8

        s1.artir();  // s1 a=6    , b =9
        s2.artir();  // s2 a=8    , b= 10

        // Soru a nın ve b nin en son degerleri kaçtır.
        System.out.println("s1.a = " + s1.a);
        System.out.println("s2.a = " + s2.a);
        System.out.println("Soru.b = " + Soru.b);
    }

}
