import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// create a box for the result and one more
// create a pointer
// iterate, skip the minimum base case
// check if we had this part of the string twice

public class RepeatedDnaSubsequences187 {

    public List<String> findRepeatedDnaSequences(String s) {
        List<String> repeatedSequence = new ArrayList<>();
        Map<String, Integer> seen = new HashMap<>();
        int i = 0;
        while (i + 10 <= s.length()) {
            String subsequence = s.substring(i, i++ + 10);
            seen.put(subsequence, seen.getOrDefault(subsequence, 0) + 1);
            if (seen.get(subsequence) == 2) {
                repeatedSequence.add(subsequence);
            }
        }
        return repeatedSequence;
    }
}
