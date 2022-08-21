package Gun18;

public class _03_JavaArray {
    public static void main(String[] args) {
        // 100 Elemanlı bir diziyi random olarak 100 e kadar olan sayılarla doldurunuz.
        // Sonrasında en büyük elemanı ve indexini bulunuz.

        int[] dizi=new int[5]; //100 Elemanlı bir diziyi

        for(int i=0;i< dizi.length ; i++)
            dizi[i]=(int)(Math.random()*100);  //diziyi random olarak 100 e kadar olan sayılarla doldurunuz.

        int enb=dizi[0]; // dizilerden ilk elemanı atadık ki, kendi aralarında kıyas olması için
        int enbIndex=0;
        for(int i=0;i< dizi.length ; i++) {

            if (dizi[i] > enb) {
                enb = dizi[i];
                enbIndex=i;
            }
        }

        System.out.println("enb = " + enb);
        System.out.println("enbIndex = " + enbIndex);
    }
}
