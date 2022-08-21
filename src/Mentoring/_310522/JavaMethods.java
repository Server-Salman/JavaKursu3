package Mentoring._310522;

public class JavaMethods {
    public static void main(String[] args) {
        /***
         * Java'da metotlar "tekrarlanan" belirli işlemleri gerçekleştirmemizi sağlayan talimatlar bütünüdür.
         * Java'da metotlar sayesinde kodun yeniden kullanılabilirliğini sağlayabiliriz veya "kodu kolaylıkla değiştirebiliriz".
         */


        /****
         * return komutu methodlardan bir değer döndürmek için kullanılır , sanıldığı üzere method sonlandırmak amacı ile kullanılmaz ,
         * return komutunun bir işlevi vardır ve işlemi biten methodların ürettiği değeri fonksiyonun çağırıldığı yere götürülmesini ve verinin kullanılabilir olmasını sağlar.
         */


        /***
         *  void = Bu ifade değer döndermeden yapılacak fonksiyonel işlemlerin gerçekleştirilmesi için kullanılır.
         */


        /** Methodlar bir isim ve değer  veya dönüş tipi verilerek oluşdurulur.
         *
         *  void ornekMethod(){   //değer dönemyen en basit method yapımız.
         *
         *  }
         *
         *
         */

        ornekMethod();
        String methoddanGelenIsim = ornekReturnMethod();
        System.out.println("methoddanGelenIsim = " + methoddanGelenIsim);
        int toplam = ornekParametricMethod(15, 3);
        System.out.println("toplam = " + toplam);
        methodKullananMethod(15, 3);

       // farkliMethodOlusturma(15, 3);                         // Ya hocam re+turn mu yapsam void mi desem bilemiyorum
       // int tplm = farkliMethodOlusturma2(15, 3);             // diyen arkadaşlar için antreman noktası.
    }




    static void ornekMethod() {
        System.out.println("satir 36 Çalıştı");
    }

    static String ornekReturnMethod() {
        String isim = "Ahmet Furkan Şimşek";
        return isim;
    }

    static int ornekParametricMethod(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    static void methodKullananMethod(int sayi1, int sayi2) {
        sayi1 += 2;
        System.out.println(ornekParametricMethod(sayi1, sayi2));
    }
}
