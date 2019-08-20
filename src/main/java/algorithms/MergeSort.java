package algorithms;

import sort.ISort;

public class MergeSort implements ISort {


    private int[] array;

    public MergeSort(int[] array) {

        this.array = array;
    }

    @Override
    public void sort() {
        sort(new int[array.length], 0, array.length - 1);
    }

    private void sort(int[] temp, int left, int right) {
        if (left >= right) return;
        int mid = (left + right) / 2;
        sort(temp, left, mid);
        sort(temp, mid + 1, right);
        merge(temp, mid, left, right);
    }

    private void merge(int[] temp, int mid, int left, int right) {
        int index = left;
        int leftStart = left;
        int leftEnd = mid;
        int rightStart = mid + 1;
        int rightEnd = right;

        while (leftStart <= leftEnd && rightStart <= rightEnd) {
            if (array[leftStart] <= array[rightStart]) {
                temp[index] = array[leftStart];
                leftStart++;
            } else {
                temp[index] = array[rightStart];
                rightStart++;
            }
            index++;
        }
        System.arraycopy(array, leftStart, temp, index, leftEnd - leftStart + 1);
        System.arraycopy(array, right, temp, index, rightEnd - rightStart + 1);
        System.arraycopy(temp, left, array, left, right - left + 1);
    }

    public void setArray(int[] array) {
        this.array = array;
    }
}
