package ohce;

public interface Input {

    void listen(Listener listener);

    void stopListening();

    @FunctionalInterface
    interface Listener {

        void handle(InputLine input);
    }
}
