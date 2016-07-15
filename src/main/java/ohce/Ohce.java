package ohce;

public final class Ohce {

    private final Output output;
    private final Clock clock;
    private final Input input;

    public Ohce(Output output, Clock clock, Input input) {
        this.output = output;
        this.clock = clock;
        this.input = input;
    }

    public void run(String name) {
        // TODO: in case of matching hours (e.g. 6) should we print night or morning greeting?
        if (clock.now().isMorning()) {
            output.print("¡Buenos días " + name + "!");
        } else if (clock.now().isAfternoon()){
            output.print("¡Buenas tardes " + name + "!");
        } else {
            output.print("¡Buenas noches " + name + "!");
        }

        input.listen(i -> output.print(new StringBuilder(i).reverse().toString()));
    }
}
