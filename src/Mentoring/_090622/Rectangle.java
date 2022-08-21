package Mentoring._090622;

import java.util.Scanner;

public class Rectangle {

    private int length;
    private int breadth;

    public void setDim(){
        Scanner oku=new Scanner(System.in);
        System.out.print("Uzunlugu girin= ");
        this.length= oku.nextInt();
        System.out.print("Yuksekligi girin= ");
        this.breadth= oku.nextInt();
    }

    public static void getArea(Rectangle rectangle){
        int Alan=rectangle.breadth* rectangle.length;
        System.out.println("Alan = " + Alan);
    }

    public static void getPerimeter(Rectangle rectangle){
        int cevre=2*(rectangle.breadth + rectangle.length);
        System.out.println("Cevre = " + cevre);
    }
}
