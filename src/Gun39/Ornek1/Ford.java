package Gun39.Ornek1;

public class Ford extends BinekOto{

    @Override
    public String getMarka() {
        return "FORD";
    }

    @Override
    public int getUretimYili() {
        System.out.println("üretildiği yıl=");
        return super.getUretimYili();
    }
}
