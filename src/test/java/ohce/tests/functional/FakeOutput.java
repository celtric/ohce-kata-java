package ohce.tests.functional;

import ohce.Output;
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

final class FakeOutput implements Output {

    private final Collection<String> outputHistory = new ArrayList<>();

    @Override
    public void print(String output) {
        outputHistory.add(output);
    }

    boolean containsLine(String aLine) {
        Collection<String> matchingLine = outputHistory
                .stream()
                .filter(l -> l.equals(aLine))
                .collect(Collectors.toList());

        return !matchingLine.isEmpty();
    }
}
