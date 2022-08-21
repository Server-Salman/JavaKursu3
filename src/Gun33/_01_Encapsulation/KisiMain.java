package Gun33._01_Encapsulation;

public class KisiMain {
    public static void main(String[] args) {

        Kisi kisi1=new Kisi();
        kisi1.ad="Hakan";
        kisi1.soyad="Taşdelen";
        //kisi1.yas=-25;
        kisi1.yasAta(-25);
        int yas = kisi1.yasGetir();

        System.out.println("kisi1 = " + kisi1);

        Kisi kisi2=new Kisi("Erol","Özgür",-30);
        System.out.println("kisi2 = " + kisi2);

    }

}
