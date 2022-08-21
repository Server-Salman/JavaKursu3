package Gun44;

public class S35 {
    public static void main(String[] args) {

        int num1[]={1,2,3};
        int num2[]={1,2,3,4,5};

        num2= num1; // num2=={1,2,3}

//        5=sayi1;  böyle bir şey OLAMAZ
//        sayi=5;  doğru durum

        num2[0]=5; // yapılan herhangi bir değişiklik
        // artık her ikisini değiştirir.
        // çünkü her ikisi aynı hafıza yerini gösteriyor.

        for(int x: num1)
        {
            System.out.print(x+":");
        }
    }
}
