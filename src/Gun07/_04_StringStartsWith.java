package Gun07;

public class _04_StringStartsWith {
    public static void main(String[] args) {
        // StartsWith : Bir stringin verilen string ile başlayıp başlamadığının
        // sonucunu boolean olark döner.

        String text="HCL Teknoloji";

        System.out.println("HC ile baslıyormu = " + text.startsWith("HC")); // true
        System.out.println("Me ile baslıyormu = " + text.startsWith("Me")); // false
        System.out.println("M ile baslıyormu = " + text.startsWith("M")); //false
        System.out.println("h ile baslıyormu = " + text.startsWith("h")); // false
        System.out.println("hc ile baslıyormu = " + text.startsWith("hc")); // false
    }
}
