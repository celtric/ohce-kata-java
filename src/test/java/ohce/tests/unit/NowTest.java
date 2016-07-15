package ohce.tests.unit;

import ohce.Now;
import org.junit.Test;

import static org.junit.Assert.*;

public final class NowTest {

    @Test
    public void considers_morning_between_6_and_12() {
        assertFalse(new Now(5).isMorning());
        assertTrue(new Now(6).isMorning());
        assertTrue(new Now(7).isMorning());
        assertTrue(new Now(11).isMorning());
        assertTrue(new Now(12).isMorning());
        assertFalse(new Now(13).isMorning());
    }

    @Test
    public void considers_afternoon_between_12_and_20() {
        assertFalse(new Now(11).isAfternoon());
        assertTrue(new Now(12).isAfternoon());
        assertTrue(new Now(13).isAfternoon());
        assertTrue(new Now(19).isAfternoon());
        assertTrue(new Now(20).isAfternoon());
        assertFalse(new Now(21).isAfternoon());
    }
}
