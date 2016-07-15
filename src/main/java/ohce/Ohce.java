package ohce;

public final class Ohce {

    private final Output output;
    private final Clock clock;

    public Ohce(Output output, Clock clock) {
        this.output = output;
        this.clock = clock;
    }

    public void run(String name) {
        if (clock.now().isMorning()) {
            output.print("¡Buenos días " + name + "!");
        } else {
            output.print("¡Buenos tardes " + name + "!");
        }
    }
}
