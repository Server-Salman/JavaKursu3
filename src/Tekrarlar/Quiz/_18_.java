package Tekrarlar.Quiz;

import java.util.Scanner;

public class _18_ {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        int x, y, z;
        System.out.println("x..:");
        x = oku.nextInt();
        y = 1;
        z = 2;
        do {
            y = y * z;
            z += 2;
        } while (z < x);
        System.out.println(y + "," + z);
    }
}
