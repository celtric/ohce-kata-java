package ohce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

final class SystemInput implements Input {

    private boolean hasBeenStopped = false;

    @Override
    public void listen(Listener listener) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            listener.handle(new InputLine(br.readLine()));
            if (!hasBeenStopped) {
                listen(listener);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void stopListening() {
        hasBeenStopped = true;
    }
}
