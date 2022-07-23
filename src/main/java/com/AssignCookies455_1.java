import java.util.Arrays;

//sort all input
//create variable for happy children and pointers
//make a cycle to identify children


public class AssignCookies455_1 {

    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int contentChildren = 0;
        int i = g.length - 1;
        int j = s.length - 1;
        while (i >= 0 && j >= 0) {
            if (s[j] >= g[i]) {
                contentChildren++;
                i--;
                j--;
            } else {
                i--;
            }
        }
        return contentChildren;
    }

    public static void main(String[] args) {
        int[] greedChildren = {1, 2};
        int[] satisfied = {1, 2, 3};
        System.out.println(findContentChildren(greedChildren, satisfied));
    }
}
