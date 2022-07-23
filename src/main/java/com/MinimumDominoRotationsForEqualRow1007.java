//In a row of dominoes, tops[i] and bottoms[i] represent the top and bottom halves of the ith domino.
// (A domino is a tile with two numbers from 1 to 6 - one on each half of the tile.)
//We may rotate the ith domino, so that tops[i] and bottoms[i] swap values.
//Return the minimum number of rotations so that all the values in tops are the same, or all the values in bottoms are the same.
//If it cannot be done, return -1.

public class MinimumDominoRotationsForEqualRow1007 {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int minSwaps = Math.min(
                amountOfSwaps(tops[0], tops, bottoms),
                amountOfSwaps(bottoms[0], tops, bottoms));
        minSwaps = Math.min(minSwaps, amountOfSwaps(tops[0], bottoms, tops));
        minSwaps = Math.min(minSwaps, amountOfSwaps(bottoms[0], bottoms, tops));
        return minSwaps == Integer.MAX_VALUE ? -1 : minSwaps;
    }

    private int amountOfSwaps(int target, int[] tops, int[] bottoms) {
        int amountOfSwaps = 0;
        for (int i = 0; i < tops.length; i++) {
            if (tops[i] != target && bottoms[i] != target) {
                return Integer.MAX_VALUE;
            } else if (tops[i] != target) {
                amountOfSwaps++;
            }
        }
        return amountOfSwaps;
    }
}
