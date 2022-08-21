package Gun28._02_Soru;

public class MyMath {

    public static int getMin(int a, int b){
        return Math.min(a,b);
    }

    public static int getMax(int a, int b){
        return Math.max(a,b);
    }

    public static double getPow(int a, int b){
        return Math.pow(a,b);
    }

    public static int getRandom(int min, int max){
       int numberInRange=(int)( Math.random() *
                            ((max-min)+1) ) +min;
       return numberInRange;
    }

    public static int getAbs(int a){
        return Math.abs(a);
    }

    public static int getDiziElemanlarTopla(int[] dizi){
        int toplam=0;

        for(int e: dizi)
           toplam+=e;

        return toplam;
    }


}
