package Gun33._02_Encapsulation;

public class Araba {
    private String renk;
    private String model;
    private int motorHacmi;
    private int kapiSayisi;

    public Araba(String renk, String model, int motorHacmi, int kapiSayisi) {
       setRenk(renk);
       setModel(model);
       setMotorHacmi(motorHacmi);
       setKapiSayisi(kapiSayisi);
    }

    public Araba() {
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMotorHacmi() {
        return motorHacmi;
    }

    public void setMotorHacmi(int motorHacmi) {
        this.motorHacmi = motorHacmi;
    }

    public int getKapiSayisi() {
        return kapiSayisi;
    }

    public void setKapiSayisi(int kapiSayisi) {
        if (kapiSayisi < 5)
           this.kapiSayisi = kapiSayisi;
        else
            System.out.println("fabrikamızda böyle bir üretim bulunmuyor");
    }

    @Override
    public String toString() {
        return "Araba{" +
                "renk='" + renk + '\'' +
                ", model='" + model + '\'' +
                ", motorHacmi=" + motorHacmi +
                ", kapiSayisi=" + kapiSayisi +
                '}';
    }
}
