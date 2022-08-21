package Gun39.Ornek2;

public class Daire extends Sekil{
   private double yaricap;

    public Daire(double yaricap) {
        setYaricap(yaricap);
    }

    @Override
    public double alan() {
        return Math.PI*yaricap*yaricap;
    }

    @Override
    public double cevre() {
        return 2*Math.PI*yaricap;
    }

    public double getYaricap() {
        return yaricap;
    }

    public void setYaricap(double yaricap) {
        this.yaricap = yaricap;
    }
}
