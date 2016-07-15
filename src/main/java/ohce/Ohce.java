package ohce;

public final class Ohce {

    private final Output output;

    public Ohce(Output output) {
        this.output = output;
    }

    public void run(String name) {
        output.print("Hola Ricard");
    }
}
