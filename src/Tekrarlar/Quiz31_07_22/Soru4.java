package Tekrarlar.Quiz31_07_22;

public class Soru4 {
    int count = 0;

    Soru4() {
        count++;
    }

    public static void main(String srt[]) {
        Soru4 c1 = new Soru4();
        Soru4 c3 = new Soru4();
        Soru4 c2 = new Soru4();
        System.out.print(c1.count + ", ");
        System.out.print(c2.count + ", ");
        System.out.print(c3.count);
    }
}
