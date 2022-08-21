package Gun45.JavaVeriTipleri;

public class JavaVeriTipleriveString {
    public static void main(String[] args) {
       int sayi=5;  // short,byte, int, long , float , double,char, boolean primitive(basit) tipler
       Integer rakam=5;  // nesne veri tipleri class, hafızada daha fazla yer kaplıyor.
       rakam.toString(); // stringe çeviriyor
       String.valueOf(sayi);  // stringe çeviriyor

        int sayi1=5;
        int sayi2=10;
        sayi1=sayi2;
        sayi1=34;
        sayi2=65;
        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);

       //Referans tipler. adresi olan


       // Referans Tipler
       int[] dizi1={1,2,3};
       int[] dizi2={4,5};

       dizi1=dizi2;
       dizi2[0]=56;

        System.out.println(dizi1[0]);
        System.out.println(dizi2[0]);

        dizi1[0]=86;

        System.out.println(dizi1[0]);
        System.out.println(dizi2[0]);


        // String tiplerin durumu farklı : Referans tip.
        // davranişi primitive fakat kategorisi REFERANS
        String isim="ismet";
        String ad="mehmet";

        isim =ad;
        isim = "ali"; // yeni oluşturduğu için herzaman fakrlı oluyor
        System.out.println("ad = " + ad);
        System.out.println("isim = " + isim);

        ad=ad.replace("e","a"); // yeniden oluşturma
        ad="mahmet"; // yeniden oluşturma
        // çünkü eski değerde değişiklik yapamıyor

        String isim2; // adı var ama hafızada yeri yok, evi yok ki adresi olsun

        // equals la ==  fark nedir  -> şekle bakınız



    }
}
