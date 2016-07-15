package ohce;

public final class InputLine {

    private final String line;

    public InputLine(String line) {
        this.line = line;
    }

    String reverse() {
        return new StringBuilder(line).reverse().toString();
    }

    boolean isPalindrome() {
        return line.equals(reverse());
    }
}
