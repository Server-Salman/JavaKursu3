package Gun24;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class _03_HashSet {
    public static void main(String[] args) {

        HashSet<String> renkler=new HashSet<>();
        renkler.add("Red");
        renkler.add("Green");
        renkler.add("Blue");
        renkler.add("Red"); // bu eklenmedi
        renkler.add("RED"); // bu eklendi

        //Ekrana yazdırma 1.yöntem
        System.out.println("renkler = " + renkler);

        //Ekrana tek tek yazdırma 2.Yöntem
        for(String s : renkler )//renklerin içindeki elemanları herhangi bir sırayla s ismini vererek gönderiyor
        {
            System.out.println("renkler = " + s);
        }

        // ben bunları kendi içinde sıralı olanların sırasına göre nasıl yazdırabilirim.TreeSet ve LinkedSet
        TreeSet<String> ts=new TreeSet<>();
        ts.add("bir");
        ts.add("iki");
        ts.add("üç");
        ts.add("dört");
        ts.add("bes");
        System.out.println("ts = " + ts); //ts = [bes, bir, dört, iki, üç]

        for(String s: ts) // sırayı garanti etmiyor
            System.out.println("s = " + s);

        Iterator gosterge= ts.iterator(); // indexi n yaptığını yapıyor.
        while (gosterge.hasNext()) // set lerde kendi içindeki sırasına göre elemanlara ulaşmak için.
        {
            System.out.println("gosterge.next() = " + gosterge.next()); //sıradaki elemanı gösteriyor
        }








    }
}
