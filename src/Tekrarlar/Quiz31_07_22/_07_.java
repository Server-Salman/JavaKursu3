package Tekrarlar.Quiz31_07_22;

public class _07_ {
    public static void main(String[] args) {
        A a = new A(5);
        a.increment();
        a.operate();
        a = new A(a.i);
        a.operate();
        a.increment();
        System.out.println("i = " + a.i);
    }
}
class A {
    int i = 0;
    A(int i) {
        this.i = i + 4;
    }
    void increment() {
        i = this.i + 1;
    }
    void operate() {
        i *= 3;
    }
}
