package Gun42.StringIslemleri;

import java.util.Arrays;

public class _02_StringBufferAndStringBuilder {
    public static void main(String[] args) {
          String cumle="";

        // String değişkeni çok fazla ekleme veya işlemlere
        // göre perfomansı oldukça düşük.
          cumle = cumle + "Bugün ";
          cumle = cumle + " hava";
          cumle = cumle + " güzel";

        System.out.println("cumle1 = " + cumle);
        cumle = cumle.concat(" oldu"); // atama gerekir
        System.out.println("cumle2 = " + cumle);

        // Eğer çok fazla String işlemleri yapacaksak bunun için
        // performansı oldukça iyi olan StringBuilder kullanılır.
        // yapısı gereği hızlı çalışır. Fakat paralel çalışan
        // uygulamalarda güvenli değildir.Ozaman StringBuffer kullanılır.
        StringBuilder s=new StringBuilder();  // StringBuffer ile her şeyi aynı
        s.append("Bugün");  // tekrar kendine atama gerektirmez.
        s.append(" hava");
        s.append(" güzel");
        System.out.println("s = " + s);

        System.out.println("s.length() = " + s.length());
        s.append(4); // eklenen her şeyi string çevirip ekler.
        System.out.println("s = " + s);

        s.reverse(); // stringi tersine çevirir.
        System.out.println("s = " + s);

        s.delete(0,5); // 0 dahil 5 hariç indexe göre siler.
        System.out.println("s = " + s);

        s.deleteCharAt(3); // sadece belirtilen indexteki karakteri siler
        System.out.println("s = " + s);

        s.insert(5,"kelime"); // 5 nolu indexe araya kelime eklendi
        System.out.println("s = " + s);

        s.insert(4, 5.46); // 4 nolu indexe rakam da double da ekleyebiliriz.
        System.out.println("s = " + s);

        int[] dizi={1,2, 43, 56};
        s.insert(6, Arrays.toString(dizi));
        System.out.println("s = " + s);

        s=new StringBuilder("Bugun hava sıcak"); // sıfırlandı ve ilk değer atandı
        System.out.println("s = " + s);

        s.replace(3,8, "bu"); // verilen aralığı verilenle değiştir
        System.out.println("s = " + s);

//        String yeniS=s.toString();
//        yeniS.replaceAll()
    }
}
