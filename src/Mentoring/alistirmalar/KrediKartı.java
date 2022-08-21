package Mentoring.alistirmalar;

import java.util.Scanner;

public class KrediKartı {
    public static void main(String[] args) {
        //Girilen bir kredi kartı bilgisini yandaki şekilde gösteriniz.   ** 4567


        Scanner oku=new Scanner(System.in);
        System.out.print("Kredi kartı numaranızı giriniz=");
        String numara=oku.nextLine();


        int birincibosluk=numara.indexOf(" ");
        int ikincibosluk=numara.indexOf(" ",birincibosluk+1);
        int ucuncubosluk=numara.indexOf(" ",ikincibosluk+1);


        String ilkdort=numara.substring(0,birincibosluk);
        String ikincidort=numara.substring(birincibosluk,ikincibosluk);
        String ucuncudort=numara.substring(ikincibosluk,ucuncubosluk);
        String dorduncudort=numara.substring(ucuncubosluk);

        String privat = numara.substring(0,ucuncubosluk);
        System.out.println(privat.replaceAll("[0-9]","*")+dorduncudort);


        // System.out.println("ilkdort = " + numara.replaceAll(ilkdort,""+numara.replaceAll(ikincidort,""+numara.replaceAll(ucuncudort,""+numara.substring(dorduncudort)))));
        //System.out.println("numara.replaceAll("[ilkdort,ikincidort,ucuncudort]","") = " + numara.replaceAll("[ilkdort,ikincidort,ucuncudort]",""));
        // System.out.println("numara = " + numara.replaceAll(numara.charAt(numara.indexOf(0,ucuncubosluk)),""));
        //System.out.println(dorduncudort);
        //System.out.println(ilkdort.replaceAll("[0-9]","*")+ikincidort.replaceAll("[0-9]","*")+ucuncudort.replaceAll("[0-9]","*")+dorduncudort);
        //System.out.println("**** **** **** "+dorduncudort);
    }
}
