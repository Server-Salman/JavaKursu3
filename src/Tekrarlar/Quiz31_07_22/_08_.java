package Tekrarlar.Quiz31_07_22;

public class _08_ {
    public static void main(String args[]) {
        Children a = new Children(16.0, 15.0);
        double average = getAverage(a.ch1, a.ch2);
        double biggerAge = getBigger(a.ch1, a.ch2);
        System.out.print(average + ", " + biggerAge);
    }
    public static double getAverage(double ch1, double ch2) {
        return ((ch1 + ch2 - ch1) + ch1) / 2;
    }
    public static double getBigger(double ch1, double ch2) {
        return (ch1 > ch2 ? ch1 : ch2);
    }
}
class Children {
    double ch1;
    double ch2;
    Children(double c1, double c2) {
        ch1 = c1;
        ch2 = c2;
    }

}
