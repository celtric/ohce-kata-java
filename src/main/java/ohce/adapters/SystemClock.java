package ohce.adapters;

import ohce.Clock;
import ohce.Now;
import java.util.Calendar;

public final class SystemClock implements Clock {

    @Override
    public Now now() {
        return new Now(Calendar.getInstance().get(Calendar.HOUR_OF_DAY));
    }
}
