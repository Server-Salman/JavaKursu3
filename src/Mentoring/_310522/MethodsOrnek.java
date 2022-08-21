package Mentoring._310522;

public class MethodsOrnek {
    public static void main(String[] args) {
       System.out.println("Methodsuz Yemek İşinin Kadevesi = "+(100*2.18));
       System.out.println("Methodsuz Traşın İşinin Kadevesi = "+(50*2.18));
       System.out.println("Methodsuz Bilgisayarın İşinin Kadevesi = "+(14999*2.18));
       System.out.println("Methodsuz Kursun İşinin Kadevesi = "+(3000*2.18));
       System.out.println("Methodsuz Gıdanın İşinin Kadevesi = "+(2400*2.18));

       System.out.println("Yemek İşinin Kadevesi = "+kdvHesaplayici(100));
       System.out.println("Traşın İşinin Kadevesi = "+kdvHesaplayici(50));
       System.out.println("Bilgisayarın İşinin Kadevesi = "+kdvHesaplayici(14999));
       System.out.println("Kursun İşinin Kadevesi = "+kdvHesaplayici(3000));
       System.out.println("Gıdanın İşinin Kadevesi = "+kdvHesaplayici(2400));
    }

    static double kdvHesaplayici(int isinFiyati){
        return isinFiyati*0.18;
    }
}
