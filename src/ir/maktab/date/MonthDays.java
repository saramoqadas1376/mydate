package ir.maktab.date;

public enum MonthDays {
    FAR(31),
    ORD(31),
    KHR(31),
    TIR(31),
    MOR(31),
    SHA(31),
    MHR(30),
    ABN(30),
    AZR(30),
    DEY(30),
    BHM(30),
    ESF(29);

    private int days;

    MonthDays(int days) {
        this.days = days;
    }

    public int getDays() {
        return days;
    }
}
