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
        int maxSum = 0;
        int currentSum = 0;
        int leftPos, rightPos;

        leftPos = 0;
        rightPos = input.length - 1;

        while (leftPos < rightPos) {
            currentSum += Math.max(input[leftPos], input[rightPos]);

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            if (input[leftPos] > input[rightPos]) {
                leftPos++;
            }
            else {
                rightPos--;
            }
        }

        return maxSum;
    }
}
