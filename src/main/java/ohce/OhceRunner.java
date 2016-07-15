package ohce;

import ohce.adapters.SystemClock;
import ohce.adapters.SystemInput;
import ohce.adapters.SystemOutput;

final class OhceRunner {

    public static void main(String[] args) {
        Ohce ohce = new Ohce(new SystemInput(), new SystemOutput(), new SystemClock());
        ohce.run(args[0]);
    }
}
