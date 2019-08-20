package algorithms;

import sort.ISort;

public class SelectionSort implements ISort {

    private int[] array;

    public SelectionSort(int[] array) {
        this.array = array;
    }

    @Override
    public void sort() {
        int length = array.length;
        int minPos;
        for (int i = 0; i < length - 1; i++) {
            minPos = i;
            for (int j = i + 1; j <= length - 1; j++) {
                if (array[j] < array[minPos]) minPos = j;
            }
            if (i != minPos) {
                swap(i, minPos);
            }
        }
    }

    private void swap(int i, int minPos) {
        int temp = array[i];
        array[i] = array[minPos];
        array[minPos] = temp;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
}
