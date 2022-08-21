package Gun43;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class _06_ThrowExample2 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        System.out.println("yeni kulanıcı ve şifre giriniz");
        System.out.print("Kullanıcı=");
        String userName=oku.nextLine();

        System.out.print("Şifre=");
        String password=oku.nextLine();

        try {
            if (password.length() < 8)
                throw new Exception("Şifre 8 karakterden az olamaz");

            if (password.length() > 15)
                throw new Exception("Şifre 15 karakterden fazla olamaz");
        }
        catch (Exception e)
        {
            System.out.println("Lütfen Dikkat !");
            System.out.println("Uyari =" + e.getMessage());
            // log tutuluyor.
            // kimler bu hatalı girişleri yapmış
            // ....
            // bir çok kontrol tek yerde toplanıyor.
        }

        // throw ile kendimiz hata oluşturuyoruz.
        // böylece kritelerimize girmeyenler için de
        // catch bloğunua düşürerek, paratik kullanım sağlıyoruz.
        // Burada ayrıca programın devamının çalışmasına gerek olmadığı için,
        // break gibi programın devamının çalışmasını engelliyoruz.

    }
}
