public class FlipImage832 {
    public int[][] flipAndInvertImage(int[][] image) {
        //this loop will swap everything in current row (flip horizontally)
        for (int i = 0; i < image.length; i++) {
            int j = 0;
            int k = image[i].length - 1;
            while (j < k) {
                int temp = image[i][j];
                image[i][j++] = image[i][k];
                image[i][k--] = temp;
            }

            //invert the value
            for (j = 0; j < image[i].length; j++) {
                image[i][j] = image[i][j] == 1 ? 0 : 1;
            }
        }
        return image;
    }
}
