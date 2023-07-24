import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestNumOfCandies1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = 0;
        for (int numCandies : candies) {
            if (max < numCandies) {
                max = numCandies;
            }
        }
        for (int numCandies : candies) {
            if (numCandies + extraCandies < max) {
                result.add(false);
            } else {
                result.add(true);
            }
        }
        return result;
    }
}
