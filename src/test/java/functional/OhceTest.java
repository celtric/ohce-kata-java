package functional;

import ohce.Now;
import ohce.Ohce;
import org.junit.Test;

public final class OhceTest {

    private static final int MORNING = 10;
    private static final int AFTERNOON = 18;
    private static final int NIGHT = 22;

    private int hourOfTheDay = MORNING;
    private final AssertableOutput output = new AssertableOutput();

    @Test
    public void greets_the_user_in_the_morning() {
        nowBeing(MORNING);

        run("Ricard");

        output.assertLineHasBeenPrinted("¡Buenos días Ricard!");
    }

    @Test
    public void greets_the_user_in_the_afternoon() {
        nowBeing(AFTERNOON);

        run("Ricard");

        output.assertLineHasBeenPrinted("¡Buenos tardes Ricard!");
    }

    @Test
    public void greets_the_user_at_night() {
        nowBeing(NIGHT);

        run("Ricard");

        output.assertLineHasBeenPrinted("¡Buenas noches Ricard!");
    }

    //---[ Helpers ]--------------------------------------------------------------------//

    private void nowBeing(int hourOfTheDay) {
        this.hourOfTheDay = hourOfTheDay;
    }

    private void run(String name) {
        new Ohce(output, () -> new Now(hourOfTheDay)).run(name);
    }
}
