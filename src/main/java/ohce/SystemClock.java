package ohce;

import java.util.Calendar;

final class SystemClock implements Clock {

    @Override
    public Now now() {
        return new Now(Calendar.getInstance().get(Calendar.HOUR_OF_DAY));
    }
}
