import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupedAnagrams49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        // This will hold all groups of anagrams
        List<List<String>> groupedAnagrams = new ArrayList<>();

        // This map uses a sorted string as the key to group anagrams together
        Map<String, List<String>> map = new HashMap<>();

        // For each word in the input array
        for (String current : strs) {
            // Convert the string to a character array to sort its letters
            char[] characters = current.toCharArray();

            // Sort the letters; anagrams will now have identical sorted arrays
            Arrays.sort(characters);

            // Rebuild a string from the sorted array (this will be our map key)
            String sorted = new String(characters);

            // If we haven't seen this key before, create a new group (list)
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }

            // Add the original word to the right anagram group
            map.get(sorted).add(current);
        }

        // Add all the groups from the map to the final answer list
        groupedAnagrams.addAll(map.values());

        // Return all grouped anagrams
        return groupedAnagrams;
    }


    public List<List<String>> groupAnagrams2(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            // Build a frequency count for each character
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }
            // Convert count array to a unique key string (e.g., "#2#1#0...#0")
            StringBuilder sb = new StringBuilder();
            for (int n : count) {
                sb.append('#').append(n);
            }
            String key = sb.toString();  // unique for anagram groups

            // Add the string to the correct group in the map
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        // Collect all grouped anagrams
        return new ArrayList<>(map.values());
    }

}
