package Gun21;

public class _05_JavaMethod {
    public static void main(String[] args) {
        int s1=4;
        int s2=66;
        int s3=17;
        int s4=45;

        int sonuc1= toplam(s1,s2);
        int sonuc2= toplam(s1,s2,s3);
        int sonuc3= toplam(s1,s2,s3,s4);  // aynı bu şekilde tipleri aynı fakat sayıları farklı ise
        //bu tip durumlar için bir kolaylık  sağlanmış.
        System.out.println("sonuc1 = " + sonuc1);
        System.out.println("sonuc2 = " + sonuc2);
        System.out.println("sonuc3 = " + sonuc3);
    }

    // gelen kaç sayı olursa olsun hepsini al dizi şeklinde metoda al
    public static int toplam(int... sayilar){  // kaç sayı gelirse gelsin onları dizi şeklidne alıyor
        int toplam=0;
        for(int i=0;i<sayilar.length;i++)
            toplam=toplam+sayilar[i];

        return  toplam;
    }




//    public static int toplam(int s1, int s2){
//        return s1+s2;
//    }
//
//    public static int toplam(int s1, int s2, int s3){
//        return s1+s2+s3;
//    }
//
//    public static int toplam(int s1, int s2, int s3, int s4){
//        return s1+s2+s3+s4;
//    }

}
