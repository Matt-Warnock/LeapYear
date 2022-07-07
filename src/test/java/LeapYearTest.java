import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {

    @Test
    void output_not_leap_year_1999() {
        boolean expected = false;
        boolean actual = new LeapYear().output(1999);

        assertEquals(expected, actual);
    }

    @Test
    void output_is_dividable_by_four() {
        boolean expected = true;
        boolean actual = new LeapYear().output(4);

        assertEquals(expected, actual);
    }


}