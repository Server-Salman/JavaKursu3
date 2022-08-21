package Gun04;

public class _07_Ornek4 {
    public static void main(String[] args) {
        //short olarak atadığınız bir değeri stringe çevirerek
        // ekrana yazdırınız.

        short sayi= 345;
        String strSayi= Short.toString(sayi); // herhangi bir işlemde sayı olarak kullanılamaz

        System.out.println("strSayi = " + strSayi);
        // ekranda sayı gibi gözükse bile aslında o bir yazi
    }
}
