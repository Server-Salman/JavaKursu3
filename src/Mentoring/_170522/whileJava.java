package Mentoring._170522;

import java.util.Scanner;

public class whileJava {
    public static void main(String[] args) {
        //Eğer sayısalbir sınır yoksa condition içeride belirlenip true - false cevap verecekse
        //While döngüsü kullanılır.

       // boolean condition = false;

       // while (condition){
       //     System.out.println(condition);
       //     bu satır sürekli bir yere istek atıp conditionun false olmasını bekliyodur
       //     //non numeric condition updation
       // }

        // Kullanıcı dur diyene kadar çalışan programı yapınız.
        Scanner sc = new Scanner(System.in);
        while (!sc.nextLine().equalsIgnoreCase("hayır")){
            System.out.println("Devam Ediyorum o halde");
        }
        System.out.println("Madem öyle bende dururum");

        // Bu güne kadar kullanılan while yapısı
        // Çünü henüz for dngüsü bilmiyorduk.
        // int i = 0;
        // while (i<50){
        //     System.out.println(i);
        //     i++;
        // }
    }
}
