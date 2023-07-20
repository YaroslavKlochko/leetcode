package algorithms;

public class BubbleSort {

    void isSwapped(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            boolean isSwapped = false;
            for (int j = 0; j < list.length - 1 - i; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    isSwapped = true;
                }
                if (isSwapped == false) {
                    break;
                }
            }
        }
    }
}
