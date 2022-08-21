package Gun39.Ornek2;

public class Geometri {
    public static void main(String[] args) {
        Dikdortgen d=new Dikdortgen(4,5);
        d.setName("Yeni Dikdörtgen");
        System.out.println("d = " + d);
        d.ciz();

        Daire dr=new Daire(5);
        dr.setName("Yeni Daire");
        System.out.println("dr = " + dr);
        dr.ciz();
    }
}
