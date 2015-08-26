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
     *  @param input sequence of layers, from top to bottom
     *
     * Output:
     *  @return Integer the sum of best layer sequence
     * */
    public static Integer cake(final int[] input) {
        return (input.length == 0) ? 0 : cake(input, 0, 0, input.length - 1);
    }

    /**
     * Recursive algorithm to calculate the best path to follow
     * given a current state.
     *
     * Input:
     *  @param input the remaining layers
     *  @param acc the sum of layers already consumed
     *  @param upperLayer upperLayer of input
     *  @param bottomLayer bottomLayer of input
     *
     * Output:
     *  @return Integer the best local solution: left, right or none
     * */
    private static Integer cake(final int[] input, final int acc, final int upperLayer, final int bottomLayer) {
        final int nlayers          = input.length,
                  upperLayerValue  = input[upperLayer],
                  bottomLayerValue = input[bottomLayer];

        if ((bottomLayer - upperLayer) < 2) {
            return Math.max(acc + upperLayerValue, 0);
        }
        else {
            int accLeft  = cake(input, acc + upperLayerValue , upperLayer + 1, bottomLayer    );
            int accRight = cake(input, acc + bottomLayerValue, upperLayer    , bottomLayer - 1);
            return max(acc, accLeft, accRight);
        }
    }

    private static Integer max(int x, int y, int z){
        return Math.max(x, Math.max(y, z));
    }
}
