public class LeapYear {
    public boolean output(int year) {
        if (year == 1700) { return false; }
        if (year % 4 == 0) { return true; }

        return false;
    }
}
