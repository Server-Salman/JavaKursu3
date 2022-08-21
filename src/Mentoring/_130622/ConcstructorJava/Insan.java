package Mentoring._130622.ConcstructorJava;

public class Insan {
   private String tcNo;
    private String ismi;
    private String soyİsmi;

    public Insan(String ismi, String soyİsmi) {
        this.tcNo=createTcNo();
        this.ismi = ismi;
        this.soyİsmi = soyİsmi;
    }
    static int sayac = 1;

    private String createTcNo(){
        return String.valueOf(++sayac);
    }


    @Override
    public String toString() {
        return "Insan{" +
                "tcNo='" + tcNo + '\'' +
                ", ismi='" + ismi + '\'' +
                ", soyİsmi='" + soyİsmi + '\'' +
                '}';
    }
}
