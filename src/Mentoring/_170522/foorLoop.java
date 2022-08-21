package Mentoring._170522;

public class foorLoop {
    public static void main(String[] args) {
        // Eğer numeric olan bir döngü şartı varsa veya şart numeriğe çevrilebilirse
        // Kullanmamız gereken döngü For Döngüsüdür.


        // Numeric şartlı döngüz
       // for (int i = 0; i <50; i++) {
       // }

        // Soru: Ahmet Furkan SIMSEK isminin her char'ını arasına virgün koyarak yazdırınzı// String isim = "Ahmet Furkan SIMSEK";

       // for (int i = 0; i <isim.length(); i++) {
       //     char a = isim.charAt(i);
       //     System.out.print(a+",");
       // }

        // Random verilen 4 basamaklı bir sayıyı tersten yazdıralım


      // int tersSayi=0;
      // int sayi = (int)(Math.random()*9999)+1000;
      // System.out.println("sayi = " + sayi);
      // for (int i = 0; i <4 ; i++) {
      //     tersSayi=tersSayi*10;
      //     tersSayi=tersSayi+sayi%10;
      //     sayi=sayi/10;
      // }
      // System.out.println("tersSayi = " + tersSayi);

        // TODO: Ahmet Furkan SImSeK Stringinin sadece büyük harflerini for döngüsü kullanark yazdırınız = AFSISK.



      //  String text = "Ahmet Furkan SImSeK";
      //  for (int i = 0; i < text.length(); i++) {
      //      if ((text.charAt(i) >= 65 && text.charAt(i) <= 90) || (text.charAt(i)>=192&&text.charAt(i)<=221)){
      //          System.oSut.print(text.charAt(i));
      //      }
      //  }

        String isim = "Ahmet Furkan SImSeK";
        String buyuk;
        for (int i = 0; i <isim.length() ; i++) {
            char karakter = isim.charAt(i);
            if (karakter>='A'&&karakter<='Z'){
                System.out.print(karakter);
            }
        }

    }
}
