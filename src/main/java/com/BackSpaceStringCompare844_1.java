public class BackSpaceStringCompare844_1 {

    public boolean backspaceCompare(String s, String t) {
        return strComparison(s).equals(strComparison(t));
    }

    private String strComparison(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c != '#') {
                sb.append(c);
            } else if (sb.length() != 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        return sb.toString();
    }
}
