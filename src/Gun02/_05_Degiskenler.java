package Gun02;

public class _05_Degiskenler {
    public static void main(String[] args) {
        // Değişkenler

        int sayi;    // int : int miktarınca alan kaplayan tam sayı tipi
        int saYi;   // bu farklı değişkendir bir harf bie büyük, küçük olsa farklı olur
        sayi=5;  // sayının degeri 5
        System.out.print("sayi=");  // kelime olarak sayı
        System.out.println(sayi);  // bu durumda değişkenin değerini yazar.
        System.out.println("sayi="+sayi); // bu durumda ikisini birlikte yazar

        sayi=7;  // sayının degeri 7

        int kisaKenar=5;
        int uzunKenar=7;
        int cevre=5+5+7+7;

        System.out.println("cevresi="+cevre);

        kisaKenar=sayi; // sayının değeri kisaKenara atandı kisaKenar=7
        cevre = (kisaKenar+uzunKenar)*2; // bilgisayarda çarpma işareti * dır
        System.out.println("cevre = " + cevre);
    }
}
