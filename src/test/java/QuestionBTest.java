import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * QuestionB unit tests.
 *
 * @author Mauricio Klein
 * @version 1.0
 * @since 2015-08-24
 * */
public class QuestionBTest {
    @Test
    public void testCake1() {
        int[] layers = {10, -2, 5, -4, 3, -5, 1};
        int output = QuestionB.cake(layers);
        assertEquals(14, output);
    }

    @Test
    public void testCake2() {
        int[] layers = {-1, -5, -7, 9, 10, 8};
        int output = QuestionB.cake(layers);
        assertEquals(27, output);
    }

    @Test
    public void testCake3() {
        int[] layers = {-1, -2, 1, -7};
        int output = QuestionB.cake(layers);
        assertEquals(0, output);
    }

    @Test
    public void testCake4() {
        int[] layers = {-1, -1, -1, -1, -1, 5, -2};
        int output = QuestionB.cake(layers);
        assertEquals(3, output);
    }

    @Test
    public void testCake5() {
        int[] layers = {-1, -2, -3, -4, -5};
        int output = QuestionB.cake(layers);
        assertEquals(0, output);
    }

    @Test
    public void testCake6() {
        int[] layers = {1, 2, 3, 4, 5};
        int output = QuestionB.cake(layers);
        assertEquals(15, output);
    }

    @Test
    public void testCake7() {
        int[] layers = {10};
        int output = QuestionB.cake(layers);
        assertEquals(10, output);
    }

    @Test
    public void testCake8() {
        int[] layers = {-5};
        int output = QuestionB.cake(layers);
        assertEquals(0, output);
    }

    @Test
    public void testCake9() {
        int[] layers = {0};
        int output = QuestionB.cake(layers);
        assertEquals(0, output);
    }

    @Test
    public void testCake10() {
        int[] layers = {};
        int output = QuestionB.cake(layers);
        assertEquals(0, output);
    }
}
