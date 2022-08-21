package Gun43;

public class _04_JavaTryCatch {
    public static void main(String[] args) {
        System.out.println("Progrm başladı");
       String str="";
       int a=5;
       int b=0;
       int c=0;

        // Catch bloklarında hangi hata önce geliyorsa ona uygun hata adı yazılır, genel Eception en sona yazılır.
       try {
           System.out.println("1.Adım");
           char ilkHarf = str.charAt(0); // hata olduğu and devamı çalışmaz uygun catch e gider
           System.out.println("2.Adım");
           c = a / b;
           System.out.println("3.adım");
       }
       catch (StringIndexOutOfBoundsException hata)// burada özel hata ismi yazılırsa; ilgili hata gelirse catch kısmı çalışır
       // ilgili hatanın dışında başka hata gelirse bunun için başka bölüm olmadığından program kırlır.
       {
           System.out.println("Kelime boş oldugu için harf alınamadı");
       }
       catch (ArithmeticException hata)
       {
           System.out.println("sayı sıfıra bölünemez");
       }
       catch (Exception hata)// hangi hata olursa olsun hata olduğunda Exception catch çalışır
       {
           System.out.println(hata.getMessage());
       }

        System.out.println("program sonu");

    }
}
