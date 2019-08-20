package algorithms;

import sort.ISort;

public class QuickSort implements ISort {


    private int[] array;

    public QuickSort(int[] array) {
        this.array = array;
    }

    @Override
    public void sort() {
        sort(0, array.length - 1);
    }

    public void sort2() {
        sort2(0, array.length - 1);
    }

    private void sort(int left, int right) {
        if (left >= right) return;
        int index = partition(left, right);
        sort(left, index - 1);
        sort(index, right);
    }

    private int partition(int left, int right) {
        int pivot = array[(left + right) / 2];
        while (left <= right) {
            while (array[left] < pivot) {
                left++;
            }
            while (array[right] > pivot) {
                right--;
            }
            if (left <= right) {
                swap(left, right);
                left++;
                right--;
            }
        }
        return left;
    }

    public void sort2(int left, int right) {
        if (left >= right) return;
        int index = partition2(left, right);
        sort2(left, index - 1);
        sort2(index + 1, right);
    }

    public int partition2(int left, int right) {
        int pivot = array[right];
        int partitionIndex = left;
        for (int i = left; i < right; i++) {
            if (array[i] < pivot) {
                swap(partitionIndex, i);
                partitionIndex++;
            }
        }
        swap(partitionIndex, right);
        return partitionIndex;
    }


    private void swap(int left, int right) {
        int temp = array[right];
        array[right] = array[left];
        array[left] = temp;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
}
