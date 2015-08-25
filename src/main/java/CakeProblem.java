import java.util.Arrays;

/**
 * CakeProblem class.
 *
 * @author Mauricio Klein
 * @version 1.0
 * @since 2015-08-24
 * */
public class CakeProblem {
    /**
     * CAKE: method that calculate the sum of best layer sequence.
     *
     * Input:
     *  @param input sequence of layers, from to to bottom
     *
     * Output:
     *  @return Integer the sum of best layer sequence
     * */
    public static Integer cake(final int[] input) {
        return cake(0, input);
    }

    /**
     * Recursive algorithm to calculate the best path to follow
     * given a current state.
     *
     * Input:
     *  @param acc the sum of layers already consumed
     *  @param subsequence the remaining layers
     *
     * Output:
     *  @return Integer the best local solution: left, right or none
     * */
    private static Integer cake(final int acc, final int[] subsequence) {
        final int subsLength = subsequence.length;

        if (subsLength == 1) {
            return acc + subsequence[0];
        }
        else{
            int accLeft  = cake(acc + subsequence[0], Arrays.copyOfRange(subsequence, 1, subsLength));
            int accRight = cake(acc + subsequence[subsLength-1], Arrays.copyOfRange(subsequence, 0, subsLength-1));
            return Math.max(acc, Math.max(accLeft, accRight));
        }
    }
}
