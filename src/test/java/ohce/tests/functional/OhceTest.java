package ohce.tests.functional;

import ohce.Now;
import ohce.Ohce;
import org.junit.Test;

import static org.junit.Assert.*;

public final class OhceTest {

    private static final int MORNING = 10;
    private static final int AFTERNOON = 18;
    private static final int NIGHT = 22;

    private int hourOfTheDay = MORNING;
    private final FakeOutput output = new FakeOutput();
    private final FakeInput input = new FakeInput();

    @Test
    public void greets_the_user_in_the_morning() {
        nowBeing(MORNING);

        run("Ricard");

        assertTrue(output.containsLine("¡Buenos días Ricard!"));
    }

    @Test
    public void greets_the_user_in_the_afternoon() {
        nowBeing(AFTERNOON);

        run("Ricard");

        assertTrue(output.containsLine("¡Buenas tardes Ricard!"));
    }

    @Test
    public void greets_the_user_at_night() {
        nowBeing(NIGHT);

        run("Ricard");

        assertTrue(output.containsLine("¡Buenas noches Ricard!"));
    }

    @Test
    public void reverses_words() {
        run();

        input("hola");

        assertTrue(output.containsLine("aloh"));
    }

    @Test
    public void celebrates_palindromes() {
        run();

        input("oto");

        assertTrue(output.containsLine("¡Bonita palabra!"));
    }

    @Test
    public void understands_stop_command() {
        run("Ricard");

        input("Stop!");

        assertTrue(output.containsLine("Adios Ricard"));
        assertTrue(input.hasBeenStopped());
    }

    @Test
    public void full_flow() {
        run("Pedro");

        input("hola");
        input("oto");
        input("stop");
        input("Stop!");

        assertTrue(input.hasBeenStopped());
        assertArrayEquals(new String[]{
                "¡Buenos días Pedro!",
                "aloh",
                "oto",
                "¡Bonita palabra!",
                "pots",
                "Adios Pedro"}, output.lines());
    }

    //---[ Helpers ]--------------------------------------------------------------------//

    private void nowBeing(int hourOfTheDay) {
        this.hourOfTheDay = hourOfTheDay;
    }

    private void run() {
        run("Foo");
    }

    private void run(String name) {
        new Ohce(input, output, () -> new Now(hourOfTheDay)).run(name);
    }

    private void input(String aString) {
        input.publish(aString);
    }
}
