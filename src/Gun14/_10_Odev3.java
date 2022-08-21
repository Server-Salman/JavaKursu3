package Gun14;

public class _10_Odev3 {
    public static void main(String[] args) {
        //3- 20-80 arasında üretilen bir sayının birler basamağını yazı ile yazdırınız.

//        int randomSayi= (int)(Math.random() * 61); // 0- 60
//        int randomSayi2= (int)(Math.random() * 61) + 20; //20-80

        int randomSayiSon= (int)(Math.random() * (80-20)+1)+20;

        int birler= randomSayiSon %10;

        switch (birler){
            case 0:System.out.print(""); break;
            case 1:System.out.print("bir"); break;
            case 2:System.out.print("iki"); break;
            case 3:System.out.print("üç"); break;
            case 4:System.out.print("dört"); break;
            case 5:System.out.print("beş"); break;
            case 6:System.out.print("altı"); break;
            case 7:System.out.print("yedi"); break;
            case 8:System.out.print("sekiz"); break;
            case 9:System.out.print("dokuz"); break;
        }
    }
}
