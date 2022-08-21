package Gun03;

public class _07_JavaString {
    public static void main(String[] args) {
        int sayi=5;

        String ad="İsmet";  // String ifadelerin sayı gibi bir sınırı olmadığından "" tırnak ile sınırı belli edilir.
        String soyad="Temur"; // Temur\0  ozel karakter koyarak sınırını belirliyor.

        System.out.println("ad");  // ad
        System.out.println(ad); // İsmet

        System.out.println("ad"+"soyad"); // ad soyad
        System.out.println(ad+soyad); // İsmetTemur

        System.out.println(ad+" "+soyad);

        String tamIsim = ad+soyad; // İsmetTemur
        String tamIsim2= ad+" "+soyad; // İsmet Temur

        System.out.println("tamIsim = " + tamIsim);
        System.out.println("tamIsim2 = " + tamIsim2);

        int yas=45;
        int kilo = 72;
        
        String bilgi= ad+soyad+yas+kilo; // sayılar String le toplanırsa kelime gibi işlem görür
        System.out.println("bilgi = " + bilgi);
        System.out.println(ad+" "+soyad+" "+yas+" "+kilo);
    }
}





