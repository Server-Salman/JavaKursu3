package Tekrarlar.Quiz02;

import java.util.HashSet;

public class _14_ {
    public static void main(String[] args) {

        HashSet<String> hs1 = new HashSet<>();
        hs1.add("Burak");
        hs1.add("Ömer");
        hs1.add("Fatih");

        if (hs1.remove(0)) {
            System.out.println("Silindi");
        } else
            System.out.println("Böyle bir veri yok.");
    }
}
