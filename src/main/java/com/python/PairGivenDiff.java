package python;

public class PairGivenDiff {

    public static int[][] PairGivenDiff(int[] arr, int k) {
        if (arr == null || arr.length == 0 || k == 0) {
            return new int[0][0];
        }

        // Map (x - k) -> x
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : arr) {
            map.put(x - k, x);
        }

        // Collect pairs [x, y] in order of y appearance in arr
        List<int[]> resultList = new ArrayList<>();
        for (int y : arr) {
            if (map.containsKey(y)) {
                int x = map.get(y);
                resultList.add(new int[]{x, y});
            }
        }

        // Convert List<int[]> to int[][]
        int[][] result = new int[resultList.size()][2];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        return result;
    }

    // Simple test
    public static void main(String[] args) {
        int[] arr = {0, -1, -2, 2, 1};
        int k = 1;
        int[][] pairs = findPairsWithGivenDifference(arr, k);
        for (int[] p : pairs) {
            System.out.println(Arrays.toString(p));
        }
    }
}
