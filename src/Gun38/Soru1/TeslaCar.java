package Gun38.Soru1;

public class TeslaCar extends Vehicle implements IElectric {
    public TeslaCar(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeBattery() {
        return "Batarya 50 yıl gider";
    }

    @Override
    public String drive() {
        return "Auto pilot sürüş özelliği var";
    }
}
