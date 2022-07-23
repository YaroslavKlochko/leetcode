import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddress929 {

    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String email : emails) {
            StringBuilder address = new StringBuilder();
            for (int i = 0; i < email.length(); i++) {
                char c = email.charAt(i);
                if (c == '.') {
                    continue;
                } else if (c == '+') {
                    address.delete(i, address.indexOf("@"));
                } else {
                    address.append(c);
                }
            }
            set.add(address.toString());
        }
        return set.size();
    }

    //------------------------------------------------------------------------------------------

    public int numUniqueEmails1(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String email : emails) {
            StringBuilder address = new StringBuilder(email);
            for (int i = 0; i < address.length(); i++) {
                if (address.charAt(i) == '.') {
                    address.deleteCharAt(i);
                } else if (address.charAt(i) == '+') {
                    address.delete(i, address.indexOf("@"));
                }
                if (address.charAt(i) == '@') {
                    break;
                }
            }
            set.add(address.toString());
        }
        return set.size();
    }
}
