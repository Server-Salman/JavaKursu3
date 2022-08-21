package Mentoring._060622;

import java.util.HashSet;

public class JavaSetsMetods {
    public static void main(String[] args) {
        HashSet hashSet1 = new HashSet();
        hashSet1.add("Furkan");
        hashSet1.add("Ragıp");
        hashSet1.add("Ebuzer");
        hashSet1.add("Ahmet"); 
        hashSet1.add("Necdet"); 
        
        HashSet hashSet2 = new HashSet();
        hashSet2.add("Halit");
        hashSet2.add("İsmet");
        hashSet2.add("Fetih");
        hashSet2.add("Arman");
        hashSet2.add("Necdet");
        
        HashSet tumEkip = new HashSet();
        tumEkip.addAll(hashSet1);
        tumEkip.addAll(hashSet2);

        System.out.println("tumEkip = " + tumEkip);
        tumEkip.removeAll(hashSet2);
        System.out.println("tumEkip = " + tumEkip);

        HashSet<String> ortaklar = new HashSet<>();
        ortaklar.addAll(hashSet1);
        ortaklar.retainAll(hashSet2);
        System.out.println("ortaklar = " + ortaklar);

        
        






        
        
    }
}
