public class CountingBits338_1 {
    public int[] countBits(int num) {
        int result[] = new int[num + 1];
        int offset = 1;
        for (int index = 1; index < num + 1; ++index) {
            if (offset * 2 == index) {
                offset *= 2;
            }
            result[index] = result[index - offset] + 1;
        }
        return result;
    }

//---------------------------------------------------------------------------------------------------------------------

    public int[] countBits1(int num) {

        int[] bits = new int[num + 1];
        for (int i = 1; i <= num; i++) {
            bits[i] = bits[i / 2];
            if (i % 2 == 1) bits[i]++;
        }
        return bits;
    }

//---------------------------------------------------------------------------------------------------------------------

    public int[] countBits2(int num) {
        int[] output = new int[num + 1];
        for (int i = 0; i < output.length; i++) {
            output[i] = output[i >> 1] + i % 2;
        }
        return output;
    }
}
