import java.util.ArrayList;
import java.util.Arrays;

public class SelectionSortingArrayLists {
    /*
     * Selection Sort
     * 
     * Selection sort works by repeatedly finding the minimum (or maximum) element
     * from the unsorted portion and placing it at the beginning (or end) of the
     * sorted portion.
     * How Selection Sort Works:
     * 
     * Start with the entire array as unsorted
     * Find the smallest element in the unsorted portion
     * Swap it with the element at the beginning of the unsorted portion
     * Expand the sorted portion by one element
     * Repeat until the entire array is sorted
     */

    public static void main(String[] args) {
        // Create a Random Array.
        int[] myArr = { 1, 2, 5, 6, 7, 3, 8, 2 };

        // Create a Random ArrayList.
        ArrayList<Integer> myArrList = new ArrayList<>(Arrays.asList(5, 4, 3, 2, 1));

        // Run Sorting Algorithms.
        sortArray(myArr);
        sortArray(myArrList);

        // Print out the Array.
        for (int i = 0; i < myArr.length; i++) {
            System.out.print(myArr[i] + " ");
        }

        System.out.println();

        // Print out the ArrayList.
        for (int i = 0; i < myArrList.size(); i++) {
            System.out.print(myArrList.get(i) + " ");
        }

        System.out.println();
    }

    public static void sortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void sortArray(ArrayList<Integer> arrList) {
        for (int i = 0; i < arrList.size(); i++) {
            int minIndex = i;

            for (int j = i + 1; j < arrList.size(); j++) {
                if (arrList.get(j) < arrList.get(minIndex)) {
                    minIndex = j;
                }
            }

            int temp = arrList.get(i);
            arrList.set(i, arrList.get(minIndex));
            arrList.set(minIndex, temp);
        }
    }
}