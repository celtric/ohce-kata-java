package ohce;

final class SystemOutput implements Output {

    @Override
    public void print(String output) {
        System.out.println(output);
    }
}
