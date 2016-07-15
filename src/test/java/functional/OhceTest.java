package functional;

import ohce.Now;
import ohce.Ohce;
import org.junit.Test;

public final class OhceTest {

    private static final int MORNING = 10;
    private static final int AFTERNOON = 18;
    private static final int NIGHT = 22;

    private int hourOfTheDay = MORNING;

    @Test
    public void greets_the_user_in_the_morning() {
        nowBeing(MORNING);

        AssertableOutput output = run("Ricard");

        output.assertLineHasBeenPrinted("¡Buenos días Ricard!");
    }

    @Test
    public void greets_the_user_in_the_afternoon() {
        nowBeing(AFTERNOON);

        AssertableOutput output = run("Ricard");

        output.assertLineHasBeenPrinted("¡Buenos tardes Ricard!");
    }

    @Test
    public void greets_the_user_at_night() {
        nowBeing(NIGHT);

        AssertableOutput output = run("Ricard");

        output.assertLineHasBeenPrinted("¡Buenas noches Ricard!");
    }

    //---[ Helpers ]--------------------------------------------------------------------//

    private void nowBeing(int hourOfTheDay) {
        this.hourOfTheDay = hourOfTheDay;
    }

    private AssertableOutput run(String name) {
        AssertableOutput output = new AssertableOutput();

        new Ohce(output, () -> new Now(hourOfTheDay)).run(name);

        return output;
    }
}
