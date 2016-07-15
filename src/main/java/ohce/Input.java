package ohce;

public interface Input {

    void listen(Listener listener);

    @FunctionalInterface
    interface Listener {

        void handle(String input);
    }
}
