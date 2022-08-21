package Gun22;

import java.util.ArrayList;

public class _01_ArrayList {
    public static void main(String[] args) {
        // array : Boyut sayısının belli olduğu durumlardaki veriler için kullanılır
        int[] dizi=new int[5]; // Array 5 elemanlı boyutu sonradan değiştirelimiyor.

        // ArrayList : Boyutu dinamik olarak değişebilen, yani eleman eklendikçe
        // artan, sildikçe azalan Array.

        ArrayList<Integer> integerList=new ArrayList<>(); // tanımlama
        ArrayList<Boolean> booleanList=new ArrayList<>();
        ArrayList<String> stringList=new ArrayList<>();

        //String ArrayList tanımlayalım
        ArrayList<String> isimler=new ArrayList<>();

        //Eleman ekleme
        isimler.add("Ahmet"); // uzunluğu 1 oldu
        isimler.add("Ayşe");  // uzunluğu 2 oldu
        isimler.add("Kaya");
        isimler.add("Kaya");  // hep sonuna ekliyor.

        System.out.println("isimler = " + isimler); // hızlı yazdırma yöntemi
        System.out.println("isimler length = " + isimler.size() ); // dizilerde ki length e karşılık geliyor

        isimler.add(1,"Zeynep");  // verılen ındex e ekliyor,  diğerleri 1 kayıyor sona doğru
        System.out.println("araya ekleme sonrası isimler = " + isimler); //

        isimler.set(1,"Fatih");  // bellı bır ındextekı elemanı değiştirme
        System.out.println("bellı bır ındextekı elemanı değiştirme isimler = " + isimler);

        int elemanSayisi=isimler.size(); // dizideki eleman sayısını verir
        System.out.println("elemanSayisi = " + elemanSayisi);

        isimler.remove("Fatih");  // elemanı kendisine göre silme
        System.out.println("Fatih silindikten sonra isimler = " + isimler);

        isimler.remove(1); // elemanı indexe göre silme işlemi
        System.out.println("1 indexteki elemanı silindikten sonra isimler = " + isimler);

        int indexOfKaya=isimler.indexOf("Kaya"); // verilen elemanın indexini verir
        System.out.println("indexOfKaya = " + indexOfKaya);

        for(int i=0;i< isimler.size(); i++)
            System.out.println("isimler eleanları = " + isimler.get(i)); // belli bir indexteki elemanı get ile alıyoruz.

        isimler.clear(); // tüm list boşaltıldı. ilk hale geldi.

    }
}
