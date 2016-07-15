package ohce;

public final class Now {

    private final int hourOfTheDay;

    public Now(int hourOfTheDay) {
        this.hourOfTheDay = hourOfTheDay;
    }

    boolean isMorning() {
        return hourOfTheDay == 10;
    }
}
