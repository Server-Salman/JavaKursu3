package Gun03;

public class _06_ScopeInceleme {
    public static void main(String[] args) {
        int a=5; // a degeri aşağıdaki parantez bölgesinde geçerli olur
                 // çünkü dışardaki içeriye erişebilir.

        {   // bu parantez arası kendine özel bölge oluşturu ve buradaki tanımlanan değişkenler
            // sadece burada geçerli olur. Kullanım amacı karışıklığı azaltmak.

            int b = 5;
            b = 77;
            a=b;
            System.out.println("b = " + b);
        } // içerde tanımlanan değişkenler sadece içerde kullanılabilir.

       // System.out.println("b = " + b); b degiskenine sadece ozel bolgede erişilebilir
        System.out.println("a = " + a);
    }
}
