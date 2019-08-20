package algorithms;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SortingTest {

    @Test
    public void bubbleSortTest() {
        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        SelectionSort selectionSort = new SelectionSort(array);
        selectionSort.sort();
        int[] res = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertArrayEquals(array, res);

        int[] array2 = {6, 3, 1, 2, 5};
        selectionSort.setArray(array2);
        selectionSort.sort();
        int[] res2 = {1, 2, 3, 5, 6};
        assertArrayEquals(array2, res2);

        int[] array3 = {2, 1};
        selectionSort.setArray(array3);
        selectionSort.sort();
        int[] res3 = {1, 2};
        assertArrayEquals(array3, res3);

        int[] array4 = {4};
        selectionSort.setArray(array4);
        selectionSort.sort();
        int[] res4 = {4};
        assertArrayEquals(array4, res4);

        int[] array5 = {};
        selectionSort.setArray(array5);
        selectionSort.sort();
        int[] res5 = {};
        assertArrayEquals(array5, res5);
    }

    @Test
    public void SelectionSortTest() {
        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        BubbleSort bubbleSort = new BubbleSort(array);
        bubbleSort.sort();
        int[] res = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertArrayEquals(array, res);

        int[] array2 = {6, 3, 1, 2, 5};
        bubbleSort.setArray(array2);
        bubbleSort.sort();
        int[] res2 = {1, 2, 3, 5, 6};
        assertArrayEquals(array2, res2);

        int[] array3 = {2, 1};
        bubbleSort.setArray(array3);
        bubbleSort.sort();
        int[] res3 = {1, 2};
        assertArrayEquals(array3, res3);

        int[] array4 = {4};
        bubbleSort.setArray(array4);
        bubbleSort.sort();
        int[] res4 = {4};
        assertArrayEquals(array4, res4);

        int[] array5 = {};
        bubbleSort.setArray(array5);
        bubbleSort.sort();
        int[] res5 = {};
        assertArrayEquals(array5, res5);
    }

    @Test
    public void InsertionSortTest() {
        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        InsertionSort insertionSort = new InsertionSort(array);
        insertionSort.sort();
        int[] res = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertArrayEquals(array, res);

        int[] array2 = {6, 3, 1, 2, 5};
        insertionSort.setArray(array2);
        insertionSort.sort();
        int[] res2 = {1, 2, 3, 5, 6};
        assertArrayEquals(array2, res2);

        int[] array3 = {2, 1};
        insertionSort.setArray(array3);
        insertionSort.sort();
        int[] res3 = {1, 2};
        assertArrayEquals(array3, res3);

        int[] array4 = {4};
        insertionSort.setArray(array4);
        insertionSort.sort();
        int[] res4 = {4};
        assertArrayEquals(array4, res4);

        int[] array5 = {};
        insertionSort.setArray(array5);
        insertionSort.sort();
        int[] res5 = {};
        assertArrayEquals(array5, res5);
    }

    @Test
    public void QuickSortTest() {
        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        QuickSort quickSort = new QuickSort(array);
        quickSort.sort();
        int[] res = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertArrayEquals(array, res);

        int[] array2 = {6, 3, 1, 2, 5};
        quickSort.setArray(array2);
        quickSort.sort();
        int[] res2 = {1, 2, 3, 5, 6};
        assertArrayEquals(array2, res2);

        int[] array3 = {2, 1};
        quickSort.setArray(array3);
        quickSort.sort();
        int[] res3 = {1, 2};
        assertArrayEquals(array3, res3);

        int[] array4 = {4};
        quickSort.setArray(array4);
        quickSort.sort();
        int[] res4 = {4};
        assertArrayEquals(array4, res4);

        int[] array5 = {};
        quickSort.setArray(array5);
        quickSort.sort();
        int[] res5 = {};
        assertArrayEquals(array5, res5);
    }

    @Test
    public void QuickSortTest2() {
        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        QuickSort quickSort = new QuickSort(array);
//        quickSort.sort2();
//        int[] res = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        assertArrayEquals(array, res);
//
        int[] array2 = {3,2,1};
        quickSort.setArray(array2);
        quickSort.sort2();
        int[] res2 = {1, 2, 3};
        assertArrayEquals(array2, res2);
//
//        int[] array3 = {2, 1};
//        quickSort.setArray(array3);
//        quickSort.sort2();
//        int[] res3 = {1, 2};
//        assertArrayEquals(array3, res3);

//        int[] array4 = {4};
//        quickSort.setArray(array4);
//        quickSort.sort2();
//        int[] res4 = {4};
//        assertArrayEquals(array4, res4);
//
//        int[] array5 = {};
//        quickSort.setArray(array5);
//        quickSort.sort2();
//        int[] res5 = {};
//        assertArrayEquals(array5, res5);
    }

    @Test
    public void MergeSortTest() {
        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        MergeSort mergeSort = new MergeSort(array);
        mergeSort.sort();
        int[] res = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertArrayEquals(array, res);

        int[] array2 = {6, 3, 1, 2, 5};
        mergeSort.setArray(array2);
        mergeSort.sort();
        int[] res2 = {1, 2, 3, 5, 6};
        assertArrayEquals(array2, res2);

        int[] array3 = {2, 1};
        mergeSort.setArray(array3);
        mergeSort.sort();
        int[] res3 = {1, 2};
        assertArrayEquals(array3, res3);

        int[] array4 = {4};
        mergeSort.setArray(array4);
        mergeSort.sort();
        int[] res4 = {4};
        assertArrayEquals(array4, res4);

        int[] array5 = {};
        mergeSort.setArray(array5);
        mergeSort.sort();
        int[] res5 = {};
        assertArrayEquals(array5, res5);
    }
}