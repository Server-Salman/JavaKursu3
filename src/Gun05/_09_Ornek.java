package Gun05;

import java.util.Scanner;

public class _09_Ornek {
    public static void main(String[] args) {
        // Kullanıcıdan username ve şifresinin girişini sağlatınız.
        Scanner oku=new Scanner(System.in);

        System.out.print("username=");
        String username=oku.nextLine();

        System.out.print("password=");
        String password=oku.nextLine();

        System.out.println("Giriş başarılı!");
    }
}
