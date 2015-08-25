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
     *  @param input the remaining layers
     *
     * Output:
     *  @return Integer the best local solution: left, right or none
     * */
    private static Integer cake(final int acc, final int[] input) {
        final int nlayers          = input.length,
                  topLayerValue    = input[0],
                  bottomLayerValue = input[nlayers-1];

        if (nlayers == 1) {
            return acc + topLayerValue;
        }
        else{
            int accLeft  = cake(acc + topLayerValue   , Arrays.copyOfRange(input, 1, nlayers  ));
            int accRight = cake(acc + bottomLayerValue, Arrays.copyOfRange(input, 0, nlayers-1));
            return max(acc, accLeft, accRight);
        }
    }

    private static Integer max(int x, int y, int z){
        return Math.max(x, Math.max(y, z));
    }
}
