package Gun35._02_Ornek;

public class Geometri {
    public static void main(String[] args) {
        Daire daire1=new Daire(3);
        System.out.println("daire1.getAlan() = " + daire1.getAlan());
        System.out.println("daire1.getCevre() = " + daire1.getCevre());


        Dikdortgen dik1=new Dikdortgen(5,4);
        System.out.println("dik1.getAlan() = " + dik1.getAlan());
        System.out.println("dik1.getCevre() = " + dik1.getCevre());
        
        Kare kare1=new Kare(4);
        System.out.println("kare1.getAlan() = " + kare1.getAlan());
        System.out.println("kare1.getCevre() = " + kare1.getCevre());
    }
}
