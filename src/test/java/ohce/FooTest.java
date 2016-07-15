package ohce;

import org.junit.Test;

import static org.junit.Assert.*;

public final class FooTest {

    @Test
    public void returns_true() {
        assertTrue(new Foo().returnTrue());
    }
}
