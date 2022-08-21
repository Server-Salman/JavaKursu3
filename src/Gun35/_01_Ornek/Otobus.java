package Gun35._01_Ornek;

public class Otobus extends Arac{ // Arac baba
    private int yolcuKapasitesi;

    public Otobus(String renk, int motor, String marka, int kapiSayisi, int yolcuKapasitesi) {
        super(renk, motor, marka, kapiSayisi); // miras alınan super class olarak adlandırılır
        // kendisi subclass yali altClass , yani evlat

         setYolcuKapasitesi(yolcuKapasitesi);
    }

    public int getYolcuKapasitesi() {
        return yolcuKapasitesi;
    }

    public void setYolcuKapasitesi(int yolcuKapasitesi) {
        this.yolcuKapasitesi = yolcuKapasitesi;
    }

    @Override
    public String toString() {
        return "Otobus{" +
                "yolcuKapasitesi=" + yolcuKapasitesi +" "+ super.toString()+
                '}';
    }
}
