import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * CakeProblem unit tests.
 *
 * @author Mauricio Klein
 * @version 1.0
 * @since 2015-08-24
 * */
public class CakeProblemTest {
    @Test
    public void testCake1() {
        int[] layers = {10, -2, 5, -4, 3, -5, 1};
        int output = CakeProblem.cake(layers);
        assertEquals(output, 14);
    }

    @Test
    public void testCake2() {
        int[] layers = {-1, -5, -7, 9, 10, 8};
        int output = CakeProblem.cake(layers);
        assertEquals(output, 27);
    }

    @Test
    public void testCake3() {
        int[] layers = {-1, -2, 1, -7};
        int output = CakeProblem.cake(layers);
        assertEquals(output, 0);
    }

    @Test
    public void testCake4() {
        int[] layers = {-1, -1, -1, -1, -1, 5, -2};
        int output = CakeProblem.cake(layers);
        assertEquals(output, 3);
    }
}
