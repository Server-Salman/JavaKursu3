package Tekrarlar.Quiz17_07_22;

public class _06_ {
    public static int a() {
        return 65;
    }

    public static int b() {
        return a();
    }

    public static void main(String[] args) {
        System.out.print("" + b());
    }
}
