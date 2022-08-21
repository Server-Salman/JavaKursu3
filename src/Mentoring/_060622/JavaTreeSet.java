package Mentoring._060622;

import java.util.HashSet;
import java.util.TreeSet;

public class JavaTreeSet {
    public static void main(String[] args) {
        // TreeSet = otomatikmen elemanları sorted (Sıralı olarak) saklar

        TreeSet<String> stringTreeSet= new TreeSet<>();
        stringTreeSet.add("Ragıp");
        stringTreeSet.add("Furkan");
        stringTreeSet.add("Ebuzer");
        stringTreeSet.add("Ahmet");


        System.out.println("stringTreeSet = " + stringTreeSet);
        boolean eklendiMiRagip = stringTreeSet.add("Ragıp");
        System.out.println("eklendiMiRagip = " + eklendiMiRagip);

        boolean eklendiMiYasin = stringTreeSet.add("Yasin");
        System.out.println("eklendiMiYasin = " + eklendiMiYasin);

        System.out.println("stringTreeSet = " + stringTreeSet);

        // String ise alfabetif int ise rakamsal olarak sıralamaya tabi tutar.
        boolean falsedeger = false;
        boolean truedeger = true;
        
        Boolean a = falsedeger;
        Boolean b = truedeger;
        
        
        TreeSet<Boolean> booleanTreeSet = new TreeSet<>();
        booleanTreeSet.add(b);
        booleanTreeSet.add(a);

        System.out.println("booleanTreeSet = " + booleanTreeSet);


        HashSet<Boolean> booleanHashSet = new HashSet<>();
        booleanHashSet.add(b);
        booleanHashSet.add(a);

        System.out.println("booleanHashSet = " + booleanHashSet);
    }
}
