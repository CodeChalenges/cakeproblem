/**
 * QuestionB class.
 *
 * @author Mauricio Klein
 * @version 1.0
 * @since 2015-08-24
 * */
public class QuestionB {
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
     *  @param input sequence of layers, from top to bottom
     *  @param acc the sum of layers already consumed
     *  @param upperLayer first layer of current division
     *  @param bottomLayer last layer of current division
     *
     * Output:
     *  @return Integer the best local solution
     * */
    private static Integer cake(final int[] input, final int acc, final int upperLayer, final int bottomLayer) {
        final int nlayers          = bottomLayer - upperLayer + 1,
                  upperLayerValue  = input[upperLayer],
                  bottomLayerValue = input[bottomLayer];

        if (nlayers == 1) {
            return Math.max(acc + upperLayerValue, 0);
        }
        else {
            int accLeft  = cake(input, acc + upperLayerValue , upperLayer + 1, bottomLayer    );
            int accRight = cake(input, acc + bottomLayerValue, upperLayer    , bottomLayer - 1);
            return max(acc, accLeft, accRight);
        }
    }

    /**
     * A convenient method to find the biggest of three variables.
     *
     * Input:
     *  @param x the first value
     *  @param y the second value
     *  @param z the third value
     *
     * Output:
     *  @return Integer the biggest of [x, y, z]
     * */
    private static Integer max(int x, int y, int z){
        return Math.max(x, Math.max(y, z));
    }
}
