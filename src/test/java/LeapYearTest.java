import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {

    @Test
    void output_not_leap_year_1999() {
        boolean expected = false;
        boolean actual = new LeapYear().output(1999);
        assertEquals(expected, actual);
    }


}