package Gun16;

public class _06_DebugOrnek {
    public static void main(String[] args) {
        // Programı adım adım çalıştırıp her satırdaki değerleri kontrol etmek
        // için başlaması istedğimiz yere breakpoint (kırmızı nokta) konur.
        // RUN yerine DEBUG seçilerek çalıştırılı.Program ilk olarak breakpoint de
        // durur ve F8 ile adım adım ilerletilir.Bu şekilde hem değerler izlenir
        // hemde nasıl çalıştığı test edilebilir.F9 ile bir break Pointten diğer Break Pointe atlanabilir.

        int a=10;  // durma noktası: break point

        a=1000;

        a+=100;

        a+=5;

        System.out.println("a = " + a);

    }
}
