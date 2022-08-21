package Gun04;

public class _05_Ornek3 {
    public static void main(String[] args) {
        // Kişinin ağırlığını double, boyunu int olarak değerler veriniz.
        // ve bir satırda boyunuz ... ve kilonuz ... şeklinde yazrınız.
        // vucut kıtle ındexını de bularak yazdırınız ( kg/ boy*boy)

        double kilo = 74.5;
        int boy= 180;

        double kitleIndexi1 = kilo/ (boy*boy);
        int kitleIndexi2 = (int)kilo/ (boy*boy);

        System.out.println("boyunuz = " + boy +" "+"kilonuz ="+ kilo );
        System.out.println("kitleIndexi1 = " + kitleIndexi1);
        System.out.println("kitleIndexi2 = " + kitleIndexi2);
    }
}
