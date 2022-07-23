import java.util.*;

// create a box for unique jewels and add them
// create a pointer
// iterate the stones and match with jewels
// return the amount of jewels

public class JewelsAndStones771 {

    public static int numJewelsInStones(String jewels, String stones) {
        Set<Character> jewelsAmount = new HashSet<>();
        for (char c : jewels.toCharArray()) {
            jewelsAmount.add(c);
        }
        Iterator<HashSet<Character>> iterator = Set.of(jewelsAmount).iterator();
        while (iterator.hasNext()) {
        }

        int numOfJewels = 0;
        for (char c : stones.toCharArray()) {
            if (jewelsAmount.contains(c)) {
                numOfJewels++;
            }
        }
        return numOfJewels;
    }

    public static void main(String[] args) {
        numJewelsInStones("sdsdsd", "vefvefsdfsdf");
    }
}
