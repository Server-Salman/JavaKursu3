package Gun28._02_Soru;

public class Soru {
    public static void main(String[] args) {
        // Math sınıfndaki metodlarıdan 5 tanesini ve bir de diziElemanlarTopla fonksiyonlarını
        // kendi isimlendirmenizle ayrı bir sınıfta yazarak,
        // (kendi metodunuzun içinde Math.fonksiyonlarını kullanabilirsiniz)
        // mainden nesne oluşturmadan direk kullanılmasını sağlatacak örnek
        // kullanımlarını yazınız.

        int min=MyMath.getMin(3,4);
        MyMath.getAbs(-5);
        MyMath.getMax(3,4);
        MyMath.getPow(2,3);
        MyMath.getRandom(3,15);

        int[] dizi={2,45,6,77,89};
        MyMath.getDiziElemanlarTopla(dizi);

        System.out.println("MyMath.getMax(3,4) = " +
                MyMath.getMax(3,4));

        System.out.println("MyMath.getRandom(3,10) = " +
                MyMath.getRandom(3,10));
    }
}
