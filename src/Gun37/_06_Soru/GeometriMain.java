package Gun37._06_Soru;

public class GeometriMain {
    public static void main(String[] args) {
        Dikdortgen d=new Dikdortgen();
        System.out.println("alan = " + d.alan(4,5));
        System.out.println("cevre = " + d.cevre(4,5));

        Daire dr=new Daire();
        System.out.println("alan = " + dr.alan(5));
        System.out.println("cevre = " + dr.cevre(5));

        Kare k=new Kare();
        System.out.println("alan = " + k.alan(3));
        System.out.println("cevre = " + k.cevre(3));


    }
}
