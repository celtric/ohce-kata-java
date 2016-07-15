package ohce;

public final class Now {

    private final int hourOfTheDay;

    public Now(int hourOfTheDay) {
        this.hourOfTheDay = hourOfTheDay;
    }

    boolean isMorning() {
        return hourOfTheDay >= 6 && hourOfTheDay <= 12;
    }

    boolean isAfternoon() {
        return hourOfTheDay >= 12 && hourOfTheDay <= 20;
    }
}
