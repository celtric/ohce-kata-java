package ohce.adapters;

import ohce.Output;

public final class SystemOutput implements Output {

    @Override
    public void print(String output) {
        System.out.println(output);
    }
}
