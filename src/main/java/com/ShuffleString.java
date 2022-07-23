public class ShuffleString {

    public String restoreString(String s, int[] indices) {
        char[] result = s.toCharArray();
        for (int i = 0; i < indices.length; i++) {
            result[indices[i]] = s.charAt(i);
        }
        return new String(result);
    }
}
