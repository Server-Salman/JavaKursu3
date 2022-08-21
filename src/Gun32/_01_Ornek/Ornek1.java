package Gun32._01_Ornek;

public class Ornek1 {
    // Verilen bir ayNo ya göre, girilen ayın kaç gun sürdüğünü bulunuz
    public static void main(String[] args) {

        int no=5;

        switch (no){
            case 2:System.out.println(28);break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 22:
            case 10:
            case 12:System.out.println(31);break;
            case 4:
            case 6:
            case 9:
            case 11:System.out.println(30);break;
        }

        String ad="Mayıs";

        switch (ad){
            case "şubat":System.out.println(28);break;
            case "ocak":
            case "mart":
            case "Nisan":
            case "agustos":
            case "nisn":
            case "haziran":
            case "aralk":System.out.println(31);break;
            case "temuz":
            case "eylÜL":
            case "Ekim":
            case "KASIM":System.out.println(30);break;
        }



    }

}
