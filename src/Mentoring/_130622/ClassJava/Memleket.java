package Mentoring._130622.ClassJava;

import java.util.ArrayList;

public class Memleket {
    public static void main(String[] args) {

        Person necdet = new Person();
        necdet.id="13681726383748763";
        necdet.name = "Necdet";
        necdet.surname = "simsek";

        System.out.println("necdet = " + necdet);
        
        Person cevdet = new Person();
        cevdet.id="8438473847384";
        cevdet.name="Cevdet";
        cevdet.surname="Polat";

        System.out.println("cevdet = " + cevdet);

        ArrayList<Person>  NufusMudurluguVeriTabani = new ArrayList<>();
        NufusMudurluguVeriTabani.add(cevdet);
        NufusMudurluguVeriTabani.add(necdet);

        System.out.println("NufusMudurluguVeriTabani = " + NufusMudurluguVeriTabani);
        //[Person{id='8438473847384', name='Cevdet', surname='Polat'},
        // Person{id='13681726383748763', name='Necdet', surname='simsek'}]
        
        
    }
}
