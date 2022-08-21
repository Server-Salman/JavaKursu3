package Gun25;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class _03_JavaMaps {
    public static void main(String[] args) {

        Map<Integer, String> hm=new HashMap<>();
        hm.put(9, "tilki");
        hm.put(2,"kedi");
        hm.put(30, "dog");
        hm.put(4,"kurt");
        hm.put(11,"yılan");
        System.out.println("hm = " + hm);//hızlı çalışma sırası

        Map<Integer, String> lhm=new LinkedHashMap<>();
        lhm.put(9, "tilki");
        lhm.put(2,"kedi");
        lhm.put(30, "dog");
        lhm.put(4,"kurt");
        lhm.put(11,"yılan");
        System.out.println("lhm = " + lhm); //ekleme sırası

        Map<Integer, String> tm=new TreeMap<>();
        tm.put(9, "tilki");
        tm.put(2,"kedi");
        tm.put(30, "dog");
        tm.put(4,"kurt");
        tm.put(11,"yılan");
        System.out.println("tm = " + tm); // her zaman sıralı


    }
}
