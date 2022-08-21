package Gun43;

public class _01_JavaRuntimeException {
    public static void main(String[] args) {

        System.out.println("program calisti");
        String kelime="";
        kelime.charAt(3);
        System.out.println("program bitti");
    }

}

// daha çalışmadan önce oluşmuş eksikliklerden kaynaklı hatalara
// Derleme zamanı yani COMPILE ERROR, Exception diyoruz.

//program çalıştıktan sonra çalışma zamanı içerisindeki hatalara
//çalışma zamanı yani RUNTIME ERROR, Exception diyoruz.