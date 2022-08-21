package Gun37._06_Soru;

public class Daire implements ISEKIL{
    @Override
    public double alan(double... dizi) {
        double yaricap=dizi[0];
        return Math.PI*yaricap*yaricap;
    }

    @Override
    public double cevre(double... dizi) {
        double yaricap=dizi[0];
        return Math.PI*yaricap*2;
    }
}
