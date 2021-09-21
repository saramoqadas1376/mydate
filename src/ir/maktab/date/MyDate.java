package ir.maktab.date;

public class MyDate {

    public static final MyDate TODAY = new MyDate(1400, 6, 30);
    public static final String DAY = "DAY";
    public static final String MONTH = "MONTH";
    public static final String YEAR = "YEAR";
    private static final int MIN_YEAR = 1;
    private static final MonthDays[] MONTHS = MonthDays.values();
    private static final int MAX_YEAR = 9999;

    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public MyDate(MyDate newDate) {
        this.year = newDate.getYear();
        this.month = newDate.getMonth();
        this.day = newDate.getDay();
    }

    public boolean isValidDate() {
        return checkYear() && checkMonth() && checkDay();
    }

    private boolean checkDay() {
        int monthMaxDay = MONTHS[this.month - 1].getDays();
        return this.day >= 1 && this.day <= monthMaxDay;
    }

    private boolean checkMonth() {
        return this.month >= 1 && this.month <= 12;
    }

    private boolean checkYear() {
        return this.year >= MyDate.MIN_YEAR && this.year <= MyDate.MAX_YEAR;
    }

    public static boolean isValidDate(int year, int month, int day) {
        return checkYear(year) && checkMonth(month) && checkDay(month, day);
    }

    private static boolean checkDay(int month, int day) {
        int monthMaxDay = MONTHS[month - 1].getDays();
        return day >= 1 && day <= monthMaxDay;
    }

    private static boolean checkMonth(int month) {
        return month >= 1 && month <= 12;
    }

    private static boolean checkYear(int year) {
        return year >= 1 && year <= 9999;
    }

    public static int getMonthLastDay(int month) {
        if (!checkMonth(month)) {
            System.out.println("The Month Is Not Valid.");
            return 0;
        }
        return MONTHS[month - 1].getDays();
    }

    public int getMonthLastDay() {
        if (!checkMonth()) {
            System.out.println("The Month Is Not Valid.");
            return 0;
        }
        return MONTHS[this.month - 1].getDays();
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}