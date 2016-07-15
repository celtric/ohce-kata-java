package functional;

import ohce.Output;
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

final class AssertableOutput implements Output {

    private Collection<String> outputHistory = new ArrayList<>();

    @Override
    public void print(String output) {
        outputHistory.add(output);
    }

    public void assertLineHasBeenPrinted(String aLine) {
        Collection<String> notMatchingLine = outputHistory
                .stream()
                .filter(l -> !l.equals(aLine))
                .collect(Collectors.toList());

        assertEquals("No line matches: " + aLine, 0, notMatchingLine.size());
    }
}
