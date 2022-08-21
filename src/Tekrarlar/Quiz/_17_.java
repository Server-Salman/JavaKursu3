package Tekrarlar.Quiz;

public class _17_ {
    public static void main(String[] args) {

        int operation = 2;
        int number = 10;

        switch (operation) {
            case 1:
                number = number + 10;
                break;
            case 2:
                number = number - 4;
            case 3:
                number = number / 3;
            case 4:
                number = number * 10;

        }
        System.out.println(number);
    }
}
