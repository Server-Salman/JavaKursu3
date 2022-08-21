package Gun22;

import java.util.ArrayList;
import java.util.Collections;

public class _03_ArrayList {
    public static void main(String[] args) {
        // ArrayList Collection grubunun bir elemanı
        // Array i sıralatırken Arrays.sort u kullandığımız gibi,
        // ArrayList i Collection metodlarını kullanacağız.

        ArrayList<Integer> rakamlar=new ArrayList<>();
        rakamlar.add(50);
        rakamlar.add(5);
        rakamlar.add(456);
        rakamlar.add(45);
        rakamlar.add(3);

        System.out.println("rakamlar ilk hali= " + rakamlar);

        //Sırala işlemleri
        Collections.sort(rakamlar); // küçükten büyüğe sıralıyor
        System.out.println("rakamlar.sort = " + rakamlar);

        Collections.reverse(rakamlar); // tersine çevirir
        System.out.println("rakamlar.revers = " + rakamlar);

        System.out.println("Collections.max(rakamlar) = " + Collections.max(rakamlar));
        System.out.println("Collections.min(rakamlar) = " + Collections.min(rakamlar));

        Collections.fill(rakamlar,0); // bütün elemanlara verilen değeri atar.
        System.out.println(".fill(0) = " + rakamlar);

        Collections.replaceAll(rakamlar, 0, 2); // 0 ları 2 ile değiştir
        System.out.println(".replaceAll(rakamlar, 0, 2) = " + rakamlar);

    }
}
