package Gun20;

public class _03_JavaMethod {
    public static void main(String[] args) {
      merhabaYaz();
      merhabaYaz();
      ismeMerhabaYaz("ismet");
    }

    public static void merhabaYaz()
    {
        System.out.println("Merhaba Dünya");
        System.out.println("Merhaba Dünya1");
    }

    public static void ismeMerhabaYaz(String isim)
    {
        System.out.println(isim+" Merhaba Dünya");
        System.out.println(isim+" Merhaba Dünya3");
    }
}
