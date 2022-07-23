import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MaxDiff {

    public static void main(String[] args) throws IOException {
        String line;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while ((line = br.readLine()) != null) {
            String[] strings = br.readLine().split(" ");
            int[] nums = new int[strings.length];
            for (int i = 0; i < strings.length; i++) {
                nums[i] = Integer.parseInt(strings[i]);
            }
            System.out.println(findAbsoluteDifference(nums[0], nums));
        }
    }

    public static int findAbsoluteDifference(int num, int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length - 1] - num;
    }
}
