package Gun11;

import java.util.Scanner;

public class _05_IfElse {
    public static void main(String[] args) {
        // Girilen bir stringin uzunluğu 10 dan büyükse ve string içinde
        // "study" kelimesi geçiyorsa ekrana evet yazdırın değilse hayır
        // yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("String giriniz=");
        String okunan=oku.nextLine();

        if ( okunan.length() > 10 && okunan.contains("study")){
            System.out.println("Evet");
        }
        else{
            System.out.println("Hayır");
        }
    }
}
