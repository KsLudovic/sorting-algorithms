package algorithms;

import sort.ISort;

public class InsertionSort implements ISort {

    private int[] array;

    public InsertionSort(int[] array){
        this.array = array;
    }

    @Override
    public void sort() {
        int length = array.length;

        for (int i = 1; i <= length-1; i++) {
            int j = i;
            int currentValue = array[j];
            while (j > 0 && array[j-1] > currentValue) {
                array[j] = array[j-1];
                j--;
            }
            array[j] = currentValue;
        }
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
}
