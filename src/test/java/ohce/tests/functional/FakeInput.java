package ohce.tests.functional;

import ohce.Input;
import ohce.InputLine;
import java.util.ArrayList;
import java.util.Collection;

final class FakeInput implements Input {

    private final Collection<Listener> listeners = new ArrayList<>();

    @Override
    public void listen(Listener listener) {
        listeners.add(listener);
    }

    void publish(String aString) {
        listeners.forEach(l -> l.handle(new InputLine(aString)));
    }
}
