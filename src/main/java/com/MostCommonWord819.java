import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// create a box for banned werds and add them
// create a box for occurrences
// modify string and count
// create a box for result
// check for better result

public class MostCommonWord819 {

    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> bannedWords = new HashSet<>();
        for (String word : banned) {
            bannedWords.add(word);
        }
        Map<String, Integer> counts = new HashMap<>();
        for (String word : paragraph.replaceAll("[^a-zA-Z]", " ").toLowerCase().split(" ")) {
            if (!bannedWords.contains(word)) {
                counts.put(word, counts.getOrDefault(word, 0) + 1);
            }
        }
        String result = "";
        for (String key : counts.keySet()) {
            if (result.equals("") || counts.get(key) > counts.get(result)) {
                result = key;
            }
        }
        return result;
    }
}
