package Mentoring._160522;

public class JavaMaths {
    public static void main(String[] args) {
        System.out.println(Math.abs(-15)); // Math.abs = mutlak değer.

        System.out.println(Math.ceil(3.1)); // Artan tarafa yuvarlama yapar = 4 Olmasını bekliyoruz
        System.out.println( Math.floor(3.6)); // Tabana yuvarlama yapar cevabıjn 3 olamsını bekliyoruz

        // Math Random 0.0 ile 1 arasında bir değer oluşturur.
        // Random ın oluşturması istenen max sayı ile çarpıldıkta sonra minimum sayı adedi ona toplanır.

       int sayac = 0;
       while (sayac<100){
           int sayi = (int)(Math.random()*(80-20)+20); // şu işlemden dışarıya 0 ile 80 arasında bir değer çıkar (80 Dahil değil)
           System.out.println(sayi);
           sayac++;
       }

       double c = 59.9;
       int f = (int)c;
       System.out.println(c);
       System.out.println("f = " + f);

       int a = (int) (Math.random()*80)+1;
       int b = (int) (Math.random()*(80-20))+20;

    }
}
