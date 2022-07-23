import java.util.ArrayList;
import java.util.List;

// a box for strings
// a box for result
// check first two, if yes add the third
// convert result

public class FindOccurrences1078 {

    public String[] findOcurrences(String text, String first, String second) {
        String[] words = text.split(" ");
        List<String> third = new ArrayList<>();
        for (int i = 0; i < text.length() - 2; i++) {
            if (words[i].equals(first) && words[i + 1].equals(second)) {
                third.add(words[i + 2]);
            }
        }
        return third.toArray(new String[0]);
    }
}
