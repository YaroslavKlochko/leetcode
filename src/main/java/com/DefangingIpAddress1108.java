//create a box for strings
// iterate and check characters
// return result

public class DefangingIpAddress1108 {

    String defangIp(String address) {
        StringBuilder result = new StringBuilder();
        for (char c : address.toCharArray()) {
            if (c == '.') {
                result.append("[.]");
            } else {
                result.append(c);
            }
        }
        return new String(result);
    }

    public String defangingIpAddress(String address) { // "192[.]168[.]1[.]1"
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            char current = address.charAt(i);
            if (current == '.') {
                result.append("[.]");
            } else {
                result.append(current);
            }
        }
        return result.toString();
    }

//------------------------------------------------

    public String defangingIpAddress1(String address) {
        return address.replace("", "[.]");
    }
}
