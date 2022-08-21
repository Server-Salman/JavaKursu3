package Tekrarlar.Quiz02;

import java.util.ArrayList;
import java.util.List;

public class _16_ {
    public static void main(String[] args) {
        List arrayList = new ArrayList();

        arrayList.add("a");
        arrayList.add("a");
        arrayList.clear();
        arrayList.add("b");
        arrayList.add("c");
        System.out.println(arrayList.size());
    }
}
