package Gun43;

import java.util.Scanner;

public class _06_ThrowExample {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.println("yeni kulanıcı ve şifre giriniz");
        System.out.print("Kullanıcı=");
        String userName=oku.nextLine();

        System.out.print("Şifre=");
        String password=oku.nextLine();

        if (password.length() < 8) {
            System.out.println("Lütfen Dikkat !");
            System.out.println("Şifre 8 karakterden az olamaz");
        }

        if (password.length() > 15) {
            System.out.println("Lütfen Dikkat !");
            System.out.println("Şifre 15 karakterden fazla olamaz");
        }

    }
}
