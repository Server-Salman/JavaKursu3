package Gun04;

public class _08_Ornek {
    public static void main(String[] args) {
        // String olarak verilen 2 adet bağış parasının toplamını yazıdırnız.

        String bagis1="500";
        String bagis2="1500";
        System.out.println(bagis1+bagis2);
        //int toplam = bagis1+bagis2;

        int intBagis1=Integer.parseInt(bagis1);
        int intBagis2=Integer.parseInt(bagis2);

        int toplamBagis= intBagis1+intBagis2;
        System.out.println("toplamBagis = " + toplamBagis);
    }
}
