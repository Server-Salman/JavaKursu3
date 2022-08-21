package Gun07;

public class _05_StringToLowerCase {
    public static void main(String[] args) {
         // toLowerCase : stringi küçük harfe çevirir.

        String text="Merhaba Dünya";

        System.out.println("ojinal hali = " + text); // Merhaba Dünya
        System.out.println("text.toLowerCase() = " + text.toLowerCase()); // merhaba dünya
        System.out.println("text büyük veya küçük harf de olsa me ile başlıyormu ?" +
                                      text.toLowerCase().startsWith("me"));
    }
}
