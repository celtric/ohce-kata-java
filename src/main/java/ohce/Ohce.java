package ohce;

public final class Ohce {

    private final Output output;
    private final Clock clock;

    public Ohce(Output output, Clock clock) {
        this.output = output;
        this.clock = clock;
    }

    public void run(String name) {
        // TODO: in case of matching hours (e.g. 6) should we print night or morning greeting?
        if (clock.now().isMorning()) {
            output.print("¡Buenos días " + name + "!");
        } else if (clock.now().isAfternoon()){
            output.print("¡Buenos tardes " + name + "!");
        } else {
            output.print("¡Buenas noches " + name + "!");
        }
    }
}
