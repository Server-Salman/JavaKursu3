package Gun06;

public class _04_StringIndexOf {
    public static void main(String[] args) {
        // Verilen karakter(lerin) string içindeki INDEX ini verir.
        //  Merhaba kelimesindeki r nin indexini bulmak istersek   kelime.IndexOf("r")  -> 2 verir
        //  Merhaba kelimesindeki ha nin indexini bulmak için  kelime.IndexOf("ha") -> 3. verir
        //  Merhaba kelimesinde a nin indexini bulmak için kelime.IndexOf("a") -> ilk bulduğunun INDEX ini verir 4 verir
        //  eğer bulamazsa -1 gönderir, bulunamadı manasında.

        String kelime="Merhaba Dünya";

        System.out.println("kelime.indexOf(r) = " + kelime.indexOf("r")); // 2
        System.out.println("kelime.indexOf(ha) = " + kelime.indexOf("ha")); // 3
        System.out.println("kelime.indexOf(a) = " + kelime.indexOf("a"));  // 4
        System.out.println("kelime.indexOf(ny) = " + kelime.indexOf("ny")); // 10
        System.out.println("kelime.indexOf( ) = " + kelime.indexOf(" ")); // 7
        System.out.println("kelime.indexOf(A) = " + kelime.indexOf("A")); // -1
        System.out.println("kelime.indexOf(a) = " + kelime.indexOf("a",5)); // 4 den sonrakilerinde araştır
    }
}
