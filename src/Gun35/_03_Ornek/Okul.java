package Gun35._03_Ornek;

public class Okul {
    public static void main(String[] args) {
        LiseOgrencisi lo1=new LiseOgrencisi("ismet", OgrTip.LISE, "MF");
        LiseOgrencisi lo2=new LiseOgrencisi("mehmet", OgrTip.LISE, "TM");

        IlkOgrenci io1=new IlkOgrenci("Muharrem", OgrTip.ILK, "satranç");
        IlkOgrenci io2=new IlkOgrenci("Beyda", OgrTip.ILK, "tiyatro");


        System.out.println("lo1 = " + lo1);
        System.out.println("io2 = " + io2);
        System.out.println("io1 = " + io1);
        System.out.println("io2 = " + io2);
    }
}
