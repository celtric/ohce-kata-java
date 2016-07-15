package ohce;

final class OhceRunner {

    public static void main(String[] args) {
        Ohce ohce = new Ohce(new SystemInput(), new SystemOutput(), new SystemClock());
        ohce.run(args[0]);
    }
}
