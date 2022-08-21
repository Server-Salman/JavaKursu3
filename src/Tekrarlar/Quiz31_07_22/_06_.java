package Tekrarlar.Quiz31_07_22;

public class _06_ {
    public class soru6 {

        public soru6() {
            System.out.println("Default constructor");
        }

        public soru6(int i) {
            this();
            System.out.println("Single parameter constructor: " + i);
        }

        public soru6(int i, int j) {
            this(j);
            System.out.println("Double parameter constructor: " + i + ", " + j);
        }

        public void main(String a[]) {
            soru6 x = new soru6(0, 2);
        }
    }
}
