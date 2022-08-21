package Tekrarlar.Quiz31_07_22;

public class soru11  {
    public int getNum() {
        return 45;
    }
    public abstract class Bar {
        public int getNum() {
            return 38;
        }
    }

    public static void main(String[] args) {
        soru11 t = new soru11() {
            public int getNum() {
                return 22;
            }
        };
        soru11.Bar f = t.new Bar() {
            public int getNum() {
                return 57;
            }
        };

        System.out.println(f.getNum() + " " + t.getNum());
    }
}
