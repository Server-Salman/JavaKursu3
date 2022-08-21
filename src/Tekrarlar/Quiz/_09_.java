package Tekrarlar.Quiz;

public class _09_ {
    public static void main(String[] args) {
        int month = 8;
        int days;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 2:
                days = 28;
                break;
            default:
                days = 30;
        }
        System.out.println(days);
    }
}
