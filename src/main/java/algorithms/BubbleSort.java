package algorithms;

import sort.ISort;

public class BubbleSort implements ISort {

    private int[] array;

    public BubbleSort(int[] array) {

        this.array = array;
    }

    @Override
    public void sort() {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(j);
                }
            }
        }
    }

    public void sort2() {
        int n = array.length - 1;
        int lastSwapPos = 0;
        do {
            for (int j = 0; j < n; j++) {
                if (array[j] > array[j + 1]) {
                    swap(j);
                    lastSwapPos = j + 1;
                }
            }
            n--;
        } while (lastSwapPos > 1);
    }

    private void swap(int i) {
        int temp = array[i];
        array[i] = array[i + 1];
        array[i + 1] = temp;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
}
