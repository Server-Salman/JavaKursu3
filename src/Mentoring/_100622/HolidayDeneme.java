package Mentoring._100622;

public class HolidayDeneme {
    public static void main(String[] args) {
        Holiday holiday1 = new Holiday("Cumhuriyet Bayrami", 29, "Ekim");
        Holiday holiday2 = new Holiday("23 Nisan", 23, "Nisan");
        boolean ayniMi = Holiday.inSameMonth(holiday1, holiday2);
        System.out.println("ayniMi = " + ayniMi);

        Holiday holiday3 = new Holiday("1 Mayis Isci Bayrami", 1, "Mayis");
        Holiday holiday4 = new Holiday("19 Mayis", 19, "Mayis");
        System.out.println("ayniMi = " + Holiday.inSameMonth(holiday3,holiday4));
    }
}
