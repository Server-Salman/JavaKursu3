package Mentoring._310522;

import java.util.ArrayList;
import java.util.HashSet;

public class MethodsAlistirma {
    public static void main(String[] args) {
        HashSet<String> strler = new HashSet<>();
        strler.add("Furkan");
        strler.add("Ebuzer");
        strler.add("Ragıp");
        strler.add("Ahmet");
        strler.add("Furkan");

        // Acaba Ragıp diye bir mentör varmı bunu true false dönen methodu oluştur.

        boolean varmi = buMentorVarmi("Ragıp",strler);
        System.out.println("varmi = " + varmi);
    }

    private static boolean buMentorVarmi(String isim, HashSet<String> list) {
        for (String mentor:list) {
            if (mentor.equals(isim)){
                return true;
            }
        }
        return false;
    }


}
