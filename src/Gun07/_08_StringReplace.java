package Gun07;

public class _08_StringReplace {
    public static void main(String[] args) {
        // bir string içindeki istene karakter(lerin) hepsini
        // verilen yenisi ile değiştirir.

        String text="Merhaba Dünya";

        System.out.println("orjinal hali= " + text); //Merhaba Dünya
        System.out.println("a ların e olarak değişmiş hali="+ text.replace("a","e")); //Merhebe Dünye
        System.out.println("ba -> de = " + text.replace("ba","de")); //Merhade Dünya
        System.out.println("Dünya -> Java = "+ text.replace("Dünya", "Java")); //Merhaba Java
        System.out.println("a -> ları silelim ="+ text.replace("a","")); //Merhb Düny
    }
}
