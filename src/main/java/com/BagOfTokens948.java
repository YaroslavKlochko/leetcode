import java.util.Arrays;

// arrange tokens in a proper order
// create pointers
// create the conditions between power, tokens and getMaxPoints
// break condition if we have some power, need need the token with biggest value

public class BagOfTokens948 {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int points = 0;
        int maxPoints = 0;
        int i = 0;
        int j = tokens.length - 1;
        while (i <= j) {
            if (power >= tokens[i]) {
                points++;
                power -= tokens[i++];
                maxPoints = Math.max(maxPoints, points);
            } else if (power > 0) {
                power--;
                power += tokens[j--];
            } else {
                return maxPoints;
            }
        }
        return maxPoints;
    }
}
