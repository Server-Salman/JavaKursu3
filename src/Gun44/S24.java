package Gun44;

public class S24 {
    public static void main(String[] args) {

        String[] strs = new String[2];
        strs[0]="";
        strs[1]="";

        int idx=0;

        for(String s: strs)
        {
            strs[idx]=strs[idx].concat(" element "+ idx);
            idx++;
        }

        for(idx=0;idx< strs.length;idx++)
        {
            System.out.print(strs[idx]);
        }







//        System.out.println("strs[0] = " + strs[0]);
//        // strs[0] suandaki hali ile yok.
//        strs[0]="";
//        strs[0].concat("ekkelime");
//
//        String isim; // değişken ismi verildi: null
//        String isim2="ismet"; // isimi2 bunun karşılığı var
//
//        String isim3="";

    }
}

//    Bilgisayarda string ifadelerin değişkene atıldığında
//        mesala 2 harfli bir değişken String değişkenine atılıyor.
//
//        String renk="AL"; -> hafızadaki hali -> AL\n
//
//        birde uzun bir değer atılıyor.
//
//        String renk="Kahverengi"; -> hafızadaki hali -> Kahverengi\n
//
//        Bilgisayar string ifadeleri yazarken hepsinin sonun son adında bize gözükmeyen
//        ama kendisin bildiği ek bir karakter ekler. böylece hafızadan nereye kadar okuyacağını
//        anlar buna satır sonu karakteri denir. görüntü itibariyle \n gibi düşünebilirsin.
//
//        eğer bir stringe "" atıldığında onun olduğu yere satır sonu karakteri atmış olursunuz.
//        yani artık NULL değildir.
//        bir string NULL ise sonu belli değildir.
// NULL olan bir değere bir şey eklenemz bu RUNTIME hatası verdirir.