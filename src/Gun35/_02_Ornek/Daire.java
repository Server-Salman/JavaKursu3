package Gun35._02_Ornek;

public class Daire extends Sekil{
    private int yaricap;

    public Daire(int yaricap) {
        setYaricap(yaricap);
    }
    @Override
    public double getAlan() {
        return Math.PI * this.yaricap
                * this.yaricap;
    }
    @Override
    public double getCevre() {
        return 2*Math.PI*this.yaricap;
    }
    public int getYaricap() {
        return yaricap;
    }

    public void setYaricap(int yaricap) {
        this.yaricap = yaricap;
    }
}
