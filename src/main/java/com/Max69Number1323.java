public class Max69Number1323 {
    public int maximum69Number(int num) {
        int firstSix = -1;
        int number = num;
        for (int i = 0; number > 0; i++) {
            if (number % 10 == 6) {
                firstSix = i;
            }
            number /= 10;
        }
        return num + 3 * (int) Math.pow(10, firstSix);
    }
}
