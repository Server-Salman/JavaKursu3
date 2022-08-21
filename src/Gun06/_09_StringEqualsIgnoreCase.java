package Gun06;

public class _09_StringEqualsIgnoreCase {
    public static void main(String[] args) {
        // equal ile aynı çalışır, büyük küçük harf ayırımı yapmaz.

        String s1="Merhaba";
        String s2="MERHABA";

        System.out.println("s2 = " + s2.equalsIgnoreCase(s1)); // eşit mi
    }
}
