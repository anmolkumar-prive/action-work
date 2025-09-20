import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Tests for Main class.
 */
public class MainTest {

    /**
     * Tests the multiply method.
     */
    @Test
    public void testMultiply() {
        final int a = 3;
        final int b = 4;
        final int expected = 12;
        assertEquals(expected, Main.multiply(a, b));
    }
}
