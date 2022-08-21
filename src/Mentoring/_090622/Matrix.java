package Mentoring._090622;

import java.util.Scanner;

public class Matrix {
    private int numberOfRows;
    private int numberOfColumns;
    int[][] array;

    public Matrix() {
        Scanner oku = new Scanner(System.in);
        System.out.print("Satir sayisini girin= ");
        this.numberOfRows = oku.nextInt();
        System.out.print("Sutun sayisini girin= ");
        this.numberOfColumns = oku.nextInt();
        this.array = new int[this.numberOfRows][this.numberOfColumns];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 100);
            }
        }
    }


}
