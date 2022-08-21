package Tekrarlar.Quiz17_07_22;

public class _11_ {
    public static int sum(int a, int b) {
        if (a + b > 10)
            return 0;
        System.out.print(a + b);
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(sum(1, sum(0, 1)));
    }
}
