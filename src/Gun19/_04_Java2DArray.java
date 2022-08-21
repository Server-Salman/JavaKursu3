package Gun19;

public class _04_Java2DArray {
    public static void main(String[] args) {
        // 2 boyutlu 3x4 diziyi random 1-10 arası sayılarla doldurup,
        // başka döngüde yazdırınız.


        int[][] tablo=new int[3][4]; //2 boyutlu 3x4 diziyi


//        tablo[0][0]=(int)(Math.random()*10);
//        tablo[0][1]=(int)(Math.random()*10);
//        tablo[0][2]=(int)(Math.random()*10);
//        tablo[0][3]=(int)(Math.random()*10);
//
//        tablo[1][0]=(int)(Math.random()*10);
//        tablo[1][1]=(int)(Math.random()*10);
//        tablo[1][2]=(int)(Math.random()*10);
//        tablo[1][3]=(int)(Math.random()*10);
//
//        tablo[2][0]=(int)(Math.random()*10);
//        tablo[2][1]=(int)(Math.random()*10);
//        tablo[2][2]=(int)(Math.random()*10);
//        tablo[2][3]=(int)(Math.random()*10);

        for(int i=0; i< 3;i++)
            for(int j=0; j< 4;j++)
                tablo[i][j]=(int)(Math.random()*10);  // bütün elemanlara random 1-10 arası sayı atandı


        // ekarana yazdırma işlemi
        for(int i=0; i< 3;i++) {

            for (int j = 0; j < 4; j++)
                System.out.print(tablo[i][j]+" ");

            System.out.println();
        }

    }
}
