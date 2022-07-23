import java.util.HashSet;
import java.util.Set;

public class RemoveVowelsFromString1119 {

    public String removeVowels(String str) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (!vowels.contains(c)) {
                result.append(c);
            }
        }
        return result.toString();
    }
}
