package Mentoring._230522;

public class nestedLoop {
    public static void main(String[] args) {
        String isim = "Ahmet Furkan SIMSEK";
                     //Ahmet Furkan SIMSEK
        // Nested Loop = iç içe döngüler.
        // Genel likle Her bir eleman için Diğer Tüm elemanları kontrol etmek amacıyla kullanılır.

        // Soru : Girilen Stringte hem büyük hem küçük hali bulunan harfleri yazdırın.
        // Çözümde ASCII Karakter tablosundan yararlandık ve bir karakterin lküçüğü ile büyüğü arasında 32 fark olduğunu gördük.
        // Bundan istifade ederek if()'in içini oluşturduk.
        // Stringin Her bir karakteri için diğer karakterleri tek tek gezdik. o an ki karakter ile arasında
        // + veya - 32 fark gördüğümüz değerleri yazıdırdık.
        // Debugdan Yararlandık.

       for (int i = 0; i <isim.length() ; i++) {
           char karakter = isim.charAt(i); // A
           for (int j = 0; j <isim.length() ; j++) {
               char ikinciChar = isim.charAt(j);
               if ((karakter+32)==isim.charAt(j) ||(karakter-32)==isim.charAt(j)){
                   System.out.println(isim.charAt(j));
               }
           }
       }
        // Bu konuda bilinmesi gereken en temel mantık. 1. döngünün her bir elamanı için 2. döngünün tam bir tur çalışmasıdır.

    }
}
