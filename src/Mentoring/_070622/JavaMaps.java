package Mentoring._070622;

import java.util.HashMap;
import java.util.Map;

public class JavaMaps {
    public static void main(String[] args) {
        // Collctions aşiretinin Set ailesi üyelerini tanımıştık.
        // Collctions aşiretinin Map ailesi üyelerini tanıyacağız

        // Set Ailesi = HashSet LinkedHashSet TreeSet
        // Map Ailesi = HashMap LinkedHashMap TreeMap

        // Map in Setten en temel farkı key ve value alıyor olmasıydı.
        // Map ailesinden HashMap
        Map<Integer,Integer>  miniMap = new HashMap<>();
        miniMap.put(18,12);
        miniMap.put(2,24);
        miniMap.put(3,15);
        miniMap.put(4,11);
        miniMap.put(3,11); // 3 Keyinin value sini güncelledik
        miniMap.put(7,null); // null değerli value yani valuesiz key mümkünmüş
        miniMap.put(null,21); 
        miniMap.put(null,null); 

        // Null (boş değer), bir değişkenin herhangi bir nesneye işaret etmemesini veya hiçbir değer tutmamasını ifade eder. 
        // Bir kod parçasındaki null'u kontrol etmek için temel bir 'if' (eğer) ifadesi kullanabilirsin. 
        // Null, bir şeyin var olmadığını belirtmek veya doğrulamak için yaygın olarak kullanılır.


        System.out.println("miniMap = " + miniMap);
        System.out.println("miniMap.get(18) = " + miniMap.get(18));
        System.out.println("miniMap.get(18) = " + miniMap.get(18));
        System.out.println("miniMap.keySet() = " + miniMap.keySet());
        System.out.println("miniMap.values() = " + miniMap.values());
        System.out.println("miniMap.containsValue(24) = " + miniMap.containsValue(24));
        System.out.println("miniMap.containsValue(28) = " + miniMap.containsValue(28));
        System.out.println("miniMap.isEmpty() = " + miniMap.isEmpty());  // önünde is varsa bir şeyin bu conditions tur
        System.out.println("miniMap.remove(3) = " + miniMap.remove(3));
        System.out.println("miniMap.remove(2) = " + miniMap.remove(2));
        System.out.println("miniMap = " + miniMap);
        System.out.println("miniMap.size() = " + miniMap.size());

        // https://www.javatpoint.com/java-map#:~:text=A%20map%20contains%20values%20on,the%20basis%20of%20a%20key.


    }



}
