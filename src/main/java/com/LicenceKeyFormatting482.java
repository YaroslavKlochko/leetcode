// create a box for strings
// create pointers
// iterate from back
// modify each character
// skip all unnecessary elements
// add a valid part for licence key
// add the rest of the characters
// format result

public class LicenceKeyFormatting482 {

    public String licenseKeyFormatting(String s, int k) {
        StringBuilder result = new StringBuilder();
        int count = 0;
        int i = s.length() - 1;
        while (i >= 0) {
            char current = Character.toUpperCase(s.charAt(i));
            if (current == '-') {
                i--;
            } else if (count != 0 && count % k == 0) {
                result.insert(0, '-');
                count = 0;
            } else {
                result.insert(0, current);
                count++;
                i--;
            }
        }
        return result.toString();
    }
}
