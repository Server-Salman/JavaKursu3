package Tekrarlar.Quiz;

public class _15_ {
    public static void main(String[] args) {

        int b = 0, c = 6;
        do {
            if (c < 4) {
                break;
            } else if (c-- < 5) {
                continue;
            }
            b++;
        } while (b++ < 7);
        System.out.print(b + "," + c);
    }

}
