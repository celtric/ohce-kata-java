package ohce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

final class SystemInput implements Input {

    @Override
    public void listen(Listener listener) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            listener.handle(new InputLine(br.readLine()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
