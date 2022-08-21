package Gun36.Protected.Paket2;

import Gun34._02_Ornek.Kedi;
import Gun36.Protected.Paket1.P1Hayvan;

public class P2Main {
    public static void main(String[] args) {
        P1Hayvan h2=new P1Hayvan();
        h2.Ad="köpek";
        // h2.yas  diğer paketten ulaşılamaz
        // h2.cinsi


        P2Kedi kedi1=new P2Kedi("kopuk","scotish");
        System.out.println("kedi1 = " + kedi1);
    }
}
