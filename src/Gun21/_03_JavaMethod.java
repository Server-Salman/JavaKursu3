package Gun21;

public class _03_JavaMethod {
    public static void main(String[] args) {

        String ad="ismet";
        String soyad="temur";
        String tamAd=topla(ad,soyad);
        System.out.println("tamAd = " + tamAd);

        int s1=4;
        int s2=5;
        int toplam=topla(s1,s2); // aynı isim fakat parametre tipleri farklı oldugundan karısmaz.
        System.out.println("toplam = " + toplam);
    }

    public static String topla(String ad, String soyad){
        return ad+" "+soyad;
    }

    public static int topla(int s1, int s2){
        return s1+s2;
    }


}
