package Gun05;

import java.util.Scanner;

public class _01_JavaScanner {
    public static void main(String[] args) {

        Scanner okuyucu=new Scanner(System.in);
        // oku ismine bir okuyucu tanımlandı, (System.in)klavyeden giriş yapmak üzere
        System.out.print("Sayi Giriniz=");
        int sayi=okuyucu.nextInt();
        // oku.nextInt() ekrandan sayıyı aldı ve bizde sayi değikenine attık

        System.out.println("sayi = " + sayi);
    }
}
