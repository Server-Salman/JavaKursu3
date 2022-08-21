package Gun28._01_Ornek;

public class JavaStaticveNonStaticMetodlar {
    public static void main(String[] args) {

        // 1.Yöntem Javanın kendi metdolarıyla yapılan çevirme işlemleri
        int sayi=345;
        String strRakam=String.valueOf(sayi);
        int intRakam=Integer.parseInt(strRakam);

        // 2.Yöntem Kendi sınıfımı yazayım ve ordan kullanayım
        Utility util=new Utility();
        strRakam = util.getSring(sayi);
        intRakam = util.getInt(strRakam);

        // 3.Yöntem
        Math.max(3,4);
        strRakam = Utility.getSring2(sayi);
        intRakam = Utility.getInt2(strRakam);

        System.out.println("strRakam = " + strRakam);
        System.out.println("intRakam = " + intRakam);

    }
}
