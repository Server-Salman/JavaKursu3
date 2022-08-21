package Mentoring._090622;

import java.util.Scanner;

public class Rectangle1 {

    private int length;
    private int breadth;

    public Rectangle1() {
        Scanner oku=new Scanner(System.in);
        System.out.print("Uzunlugu girin= ");
        this.length= oku.nextInt();
        System.out.print("Yuksekligi girin= ");
        this.breadth= oku.nextInt();
    }

//    public void setDim(){
//        Scanner oku=new Scanner(System.in);
//        System.out.print("Uzunlugu girin= ");
//        this.length= oku.nextInt();
//        System.out.print("Yuksekligi girin= ");
//        this.breadth= oku.nextInt();
//    }

    public static void getArea(Rectangle1 rectangle){
        int Alan=rectangle.breadth* rectangle.length;
        System.out.println("Alan = " + Alan);
    }

    public static void getPerimeter(Rectangle1 rectangle){
        int cevre=2*(rectangle.breadth + rectangle.length);
        System.out.println("Cevre = " + cevre);
    }
}
