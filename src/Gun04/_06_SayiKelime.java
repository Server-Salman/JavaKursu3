package Gun04;

public class _06_SayiKelime {
    public static void main(String[] args) {
        String girilenKelime="65";  // bu haliyle mesala Ahmet kelimesinde farksız toplama yapılamaz
        System.out.println("girilenKelime = " + girilenKelime);

        //Kelimenin-> sayıya çevrilmesi
        int intDeger = Integer.parseInt(girilenKelime);
        double doubleDeger = Double.parseDouble(girilenKelime);

        System.out.println("intDeger = " + intDeger);
        System.out.println("doubleHali = " + doubleDeger);

        int toplam= intDeger + intDeger;

        /*Bu gün hava 15 derece.
        görüntü rakam olsa bile toplanamadığı için yazıdır
        burada kelime olarak geçiyor.
        aslında bunu on beş gibi düşünebiliriz.
        Bu -> Kelime
        gün -> kelime
        hava ->kelime
        15 -> kelime   toplama yapamazsın bu yüzden

        int dereceSayi= Integer.parseInt(dereceYazi);*/


        /*    Rakamı yazıya çevirmek diyelim  */
        // Hava sıcaklığını rakam olarak tanımlayınız ve bir cümle şeklinde
        // Bu gun hava 12 derece yazdırınız.
        int sicaklik =12; // toplanabilir
        System.out.println("Bugun hava "+sicaklik+" derece."); // otomatik hali

        String sicaklikKelimeHali=Integer.toString(sicaklik); // toplanamaz
        //int toplam= sicaklikKelimeHali+sicaklikKelimeHali; // toplanamaz

        System.out.println("Bugun hava "+sicaklikKelimeHali+" derece."); // donüştürüldü
    }
}
