package Mentoring._060622;

import java.util.HashSet;

public class JavaHashSet {
    public static void main(String[] args) {
        // Javada collections ailesinin bir üyesi olan Set lerin bizim için en temel özelliği aynı elemandan 2 tane bulundurmaması.
        // Setler içerisindeki elemanları biz özellikle sıralamasını istemediysek kendi algoritmasına sıralar.
        // Eğer bir sıralamasını istersek sort methodunu kullanabilirz. 
        // 3 Çeşit set vardır. 
        // TreeSet = otomatikmen elemanları sorted (Sıralı olarak) saklar
        // HashSet = içlerinde en hızlı olan set çeşididir çünkü bir sıralama yapmadığı için en hızlı dönebileceği(return) şekilde saklar
        // LinkedHashSet = Elemanları ekleme sırasına göre return eden set methodudur.

        HashSet<String> strHashSet = new HashSet<>();

        strHashSet.add("Ragıp");
        strHashSet.add("Ebuzer");
        strHashSet.add("Ahmet");
        strHashSet.add("Ragıp");

        boolean eklendiMi = strHashSet.add("Ragıp");
        boolean eklendiFurkan = strHashSet.add("Furkan");

        System.out.println("eklendiFurkan = " + eklendiFurkan);
        System.out.println("eklendiMi = " + eklendiMi);

        System.out.println("strHashSet = " + strHashSet);
        

    }
}
