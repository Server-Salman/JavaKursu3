package Gun06;

public class _11_StringLastIndexOf {
    public static void main(String[] args) {
        // IndexOf gibi çalışır, ama sondan itibaren indexi veriri.

        String s1="Merhaba";

        System.out.println("Bastan a nın indexi = " + s1.indexOf("a")); // 4
        System.out.println("Sondan araştırmaya başlayarak a nın indexi = " + s1.lastIndexOf("a"));//6
        // index her zaman soldan sayılarak 0 dan itibaren dir.Index her zaman tektir.
    }
}
