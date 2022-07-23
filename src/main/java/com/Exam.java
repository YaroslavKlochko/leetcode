import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exam {
    public static void main(String[] args) throws java.lang.Exception {

        String line;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while ((line = br.readLine()) != null) {
            System.out.println(findDifference(line));
        }
    }

    public static int findDifference(String s) {

        List<Integer> nums = new ArrayList<>();
        for (String str : s.split(" ")) {
            nums.add(Integer.parseInt(str));
        }
        int odd = 0;
        int even = 0;

        for (int n : nums) {
            if (n % 2 == 0) {
                even++;
            } else
                odd--;
        }
        int sum = Math.max(odd, even) + Math.min(odd, even);
        return Math.abs(sum);
    }
}
