package Gun06;

public class _10_StringIsEmpty {
    public static void main(String[] args) {
        // Bir stringin boş olup olmadığını boolean olarak söyler

        String s1="Merhaba";
        System.out.println("s1.isEmpty() = " + s1.isEmpty()); // false

        String s2=" ";
        System.out.println("s2.isEmpty() = " + s2.isEmpty()); // false

        String s3="";
        System.out.println("s3.isEmpty() = " + s3.isEmpty());  // true
    }
}
