package ohce;

public interface Input {

    void listen(Listener listener);

    @FunctionalInterface
    interface Listener {

        void handle(InputLine input);
    }
}
