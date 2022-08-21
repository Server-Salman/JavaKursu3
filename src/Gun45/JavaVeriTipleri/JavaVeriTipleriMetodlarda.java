package Gun45.JavaVeriTipleri;

import java.util.Arrays;

public class JavaVeriTipleriMetodlarda {
    int a1;
    static int a2;

    static void metod1(){

    }


    public static void main(String[] args) {
       JavaVeriTipleriMetodlarda j=new JavaVeriTipleriMetodlarda();
       j.a1=7;

       a2=8;
       metod1();
       /********************************/

       int a=5;
       doProduct(a);  // a nın değeri değişmez
       System.out.println("a = " + a); // anın değeri değişirmi
       /***************/

       int[] dizi1={1,2,3};
       doProduct2(dizi1);
       System.out.println("dizi1 = " + Arrays.toString(dizi1));
       // a) 123  b) 65 2 3
       //  sadece değerleri mi gidiyor
       // yoksa adresi mi gidiyor, yani kendisi mi gidiyor
        // REFERANS tipleri metodlara aresi gider
        //dolayısılyla değerleri değişir,ve ruturna gerek kalmaz.

        // Stringi davranışı primitive gibi oldugundan sadece değeri
        // metoda gider kendisi değil.
        String isim="ismet";
        doProduct3(isim);
        System.out.println("isim = " + isim);
    }


    public static void doProduct3(String isim){ //buraya değer geldi
        isim="mahmut";
    }








    public static void doProduct2(int[] dizi2){
        dizi2[0]=65;
    }










    public static void doProduct(int a){
        a=5*a; //
    }

}
