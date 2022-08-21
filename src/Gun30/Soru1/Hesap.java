package Gun30.Soru1;

public class Hesap {
    private int yatan=0;
    private int cekilen=0;
    private int bakiye=0;

    public void paraYatir(int gelenPara){
        this.bakiye+=gelenPara;
        this.yatan+=gelenPara;
    }

    public void paraCek(int cekilenPara) {

        if (this.bakiye < cekilenPara) {
            System.out.println("Bakiye yetersiz");
        }
        else {
            bakiye = bakiye - cekilenPara;
            cekilen = cekilen + cekilenPara;
        }
    }

    @Override
    public String toString() {
        return "Hesap{" +
                "yatan=" + yatan +
                ", cekilen=" + cekilen +
                ", bakiye=" + bakiye +
                '}';
    }
}
