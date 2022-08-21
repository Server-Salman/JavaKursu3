package Tekrarlar.Quiz17_07_22;

public class _12_ {
    public static int sum(int a, int b) {
    System.out.print(a + "" + b);
    return a + b;
}

    public static void main(String[] args) {
        System.out.println(sum(sum(1, 2), 3));
    }
}
