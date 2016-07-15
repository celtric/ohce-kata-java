package ohce;

public final class Ohce {

    private final Input input;
    private final Output output;
    private final Clock clock;

    public Ohce(Input input, Output output, Clock clock) {
        this.input = input;
        this.output = output;
        this.clock = clock;
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

        input.listen(i -> {
            output.print(i.reverse());

            if (i.isPalindrome()) {
                output.print("¡Bonita palabra!");
            }

            if (i.isStopCommand()) {
                output.print("Adios " + name);
                input.stopListening();
            }
        });
    }
}
