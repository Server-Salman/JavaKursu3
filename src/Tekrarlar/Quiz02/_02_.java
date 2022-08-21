package Tekrarlar.Quiz02;

public class _02_ {
   public static void main(String[] args) {

            int x[] = {2, 7, 6, 5, 4, -10};
            x[2] = -5;
            int y = x[0] + x[4];
            x[5] = y;
            x[3] = x[1] + y;
            System.out.print(x[1] + x[3] + x[5]);
        }



}