package Gun28._03_Soru;

import java.util.ArrayList;

public class Student {
    String name;
    int maxCredit;
    ArrayList<Lesson> dersleri= new ArrayList<>();

    public void dersEkle(Lesson ders)
    {
        //gelen dersin kredisi artı var olan krediyi toplayıp
        //kontrol edeceğiz , öğrencini maxKredisi aşıyor mu?
        int toplamAlinanKredi=0;
        for(Lesson l: dersleri) {
            toplamAlinanKredi = toplamAlinanKredi + l.credit;
        }

        System.out.println("toplamAlinanKredi = " + toplamAlinanKredi);

        if (toplamAlinanKredi+ders.credit <= maxCredit) {
            dersleri.add(ders);
            System.out.println("Eklendi = " + ders.name);
        }
        else
            System.out.println("Alınabilinecek kredi miktarı aşıldı="+ders.name);
    }

}
