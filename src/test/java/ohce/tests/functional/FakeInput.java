package ohce.tests.functional;

import ohce.Input;
import ohce.InputLine;
import java.util.ArrayList;
import java.util.Collection;

final class FakeInput implements Input {

    private final Collection<Listener> listeners = new ArrayList<>();
    private boolean hasBeenStopped = false;

    @Override
    public void listen(Listener listener) {
        listeners.add(listener);
    }

    @Override
    public void stopListening() {
        hasBeenStopped = true;
    }

    void publish(String aString) {
        listeners.forEach(l -> l.handle(new InputLine(aString)));
    }

    boolean hasBeenStopped() {
        return hasBeenStopped;
    }
}
