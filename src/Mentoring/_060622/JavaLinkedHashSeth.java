package Mentoring._060622;

import java.util.LinkedHashSet;

public class JavaLinkedHashSeth {
    public static void main(String[] args) {
        //LinkedHashSet = Elemanları ekleme sırasına göre return eden set methodudur.

        LinkedHashSet<String> stringLinkedHashSet = new LinkedHashSet<>();
        stringLinkedHashSet.add("Furkan");
        stringLinkedHashSet.add("Ragıp");
        stringLinkedHashSet.add("Necdet");
        stringLinkedHashSet.add("Ebuzer");
        stringLinkedHashSet.add("Ahmet");
        boolean necdetEklendiMi = stringLinkedHashSet.add("Necdet");

        System.out.println("necdetEklendiMi = " + necdetEklendiMi);
        System.out.println("stringLinkedHashSet = " + stringLinkedHashSet);
    }
}
