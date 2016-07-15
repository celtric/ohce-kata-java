package functional;

import ohce.Ohce;
import org.junit.Test;

public final class OhceTest {

    @Test
    public void greets_the_user() {
        AssertableOutput output = run("Ricard");

        output.assertLineHasBeenPrinted("Hola Ricard");
    }

    private AssertableOutput run(String name) {
        AssertableOutput output = new AssertableOutput();

        new Ohce(output).run(name);

        return output;
    }
}
