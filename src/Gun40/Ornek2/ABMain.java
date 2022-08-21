package Gun40.Ornek2;

public class ABMain {
    public static void main(String[] args) {
        A a=new A();
        System.out.println("A.mesaj = " + A.mesaj);

        B b=new B();
        System.out.println("B.mesaj = " + B.mesaj);

        A a2=new A();
        System.out.println("A.mesaj = " + A.mesaj);
    }
}
// Bu main çalıştırılınca nasıl bir çıktı verir ?
// A dan merhaba
// B den merhaba
// B den merhaba