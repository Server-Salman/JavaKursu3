package Gun40.Ornek1;

public class HayvanatBahcesi {
    public static void main(String[] args) {
        Kedi kd=new Kedi("Köpük", false, "01/01/2015");
        System.out.println("kd = " + kd);

        Kartal kr=new Kartal("Kartal", true, "05/05/2010");
        System.out.println("kr = " + kr);
    }
}
