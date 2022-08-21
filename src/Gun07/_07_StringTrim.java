package Gun07;

public class _07_StringTrim {
    public static void main(String[] args) {
        // trim : Stringin başındaki veya sonundaki boşluk karakterlerini temizler

        String text="  Merhaba Dümya  ";

        System.out.println("textin orjinal hali= ->"+ text +"<-");
        System.out.println("textin trimmlenmiş hali= ->"+ text.trim() +"<-");
    }
}
