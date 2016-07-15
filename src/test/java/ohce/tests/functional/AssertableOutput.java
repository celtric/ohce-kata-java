package ohce.tests.functional;

import ohce.Output;
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

final class AssertableOutput implements Output {

    private final Collection<String> outputHistory = new ArrayList<>();

    @Override
    public void print(String output) {
        outputHistory.add(output);
    }

    void assertLineHasBeenPrinted(String aLine) {
        Collection<String> matchingLine = outputHistory
                .stream()
                .filter(l -> l.equals(aLine))
                .collect(Collectors.toList());

        assertFalse("No line matches: " + aLine, matchingLine.isEmpty());
    }
}
