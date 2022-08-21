package Gun38.Soru1;

public class Bus extends Vehicle implements IDiesel{
    public Bus(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changeDiesel() {
        return "Bir depo ile 1000km gider";
    }

    @Override
    public String drive() {
        return "Şehir içine girme, ve yavaş sür, yolcuları rahatsız etme";
    }
}
