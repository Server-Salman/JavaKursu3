package Mentoring._240522;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class javaArray {
    public static void main(String[] args) {
        // Javada her özelliğin en temel noktası veriyi saklama ihtiyacından dolayı ortaya çıkmalarıdır.
        // ilk olarak primitive type'ları gördük ve bu tiplerde bazı verileri taşıya bildik.
        // şimdi karşımıza daha fazla veri tutmaya yarayan Array[] kavramı çıktı.
        // Arrayi kısaca çoklu veriyi taşımaya yarayan en temel depo olarak tanımlayabiliriz.


        int[] numericArray = new int[10];
        // ilk ranımladığımız arraya sonradan veri ekleyebiliriz.
        //örn:
        numericArray[0]=5;
        // Scanner la dolduralım
        // Scanner sc = new Scanner(System.in);
        // numericArray[1] = sc.nextInt();
        int[] numericArray2 = {2,3,4,16,5,3,71,6,7,9,18};
        // Burada 2. array tanımlama şeklinde yeni bir eleman eklemek mümkün değil.

        // 2 Çeşit Array yazdırma yöntemi var.

        System.out.println("numericArray2 Arrays values = "+ Arrays.toString(numericArray2));
        System.out.println("numericArray Arrays values = "+ Arrays.toString(numericArray));

        //Array doldurma =
        //Arrays.fill(numericArray,18);
        System.out.println("numericArray Arrays values after filling with 18 = "+ Arrays.toString(numericArray));
        // Döngü ile Array doldurma =
        for (int i = 0; i <numericArray.length ; i++) {
            numericArray[i]= (int)(Math.random()*100)+1;
        }
        System.out.println("numericArray Arrays values after random filling = "+ Arrays.toString(numericArray));

        // Arrayleri nasıl dolduracağımızı gördük. şimdi nasıl sıralayacağımıza bakalım :
        Arrays.sort(numericArray);
        System.out.println("numericArray Arrays values after shorting = "+ Arrays.toString(numericArray));

        // Alp Ugurlu = hocam ismet hoca sort yapmadan binary search yapinca hatali verme "İHTİMALİ" var demisiti
        Arrays.sort(numericArray2);
        System.out.println(Arrays.binarySearch(numericArray2,19));
        System.out.println("5 in indexi ="+Arrays.binarySearch(numericArray2,5));
        System.out.println(Arrays.binarySearch(numericArray2,18));
        int indexof5 = Arrays.binarySearch(numericArray2,5);
        System.out.println("indexof5 = " + indexof5);
        
        String[] strArray = {"Ahmet","Furkan","simsek","Leyla","Fransa","omer"};
        Arrays.sort(strArray);
        System.out.println("After Short Arrays.toString(strArray) = " + Arrays.toString(strArray));
        int FurkanIndex = Arrays.binarySearch(strArray,"omer");
        System.out.println("FurkanIndex = " + FurkanIndex);


    }
}
