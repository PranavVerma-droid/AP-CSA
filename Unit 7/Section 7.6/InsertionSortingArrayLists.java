import java.util.ArrayList;
import java.util.Arrays;

public class InsertionSortingArrayLists {
    /*
     * Insertion Sort
     * 
     * Insertion sort builds the sorted array one element at a time by taking
     * elements from the unsorted portion and inserting them into their correct
     * position in the sorted portion.
     * How Insertion Sort Works:
     * 
     * Start with the first element considered as sorted
     * Take the next element from the unsorted portion
     * Insert it into its correct position in the sorted portion
     * Repeat until all elements are sorted
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
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;

            // Move elements greater than current to one position ahead
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Place current in its correct position
            arr[j + 1] = current;
        }
    }

    public static void sortArray(ArrayList<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            int current = list.get(i);
            int j = i - 1;

            while (j >= 0 && list.get(j) > current) {
                list.set(j + 1, list.get(j));
                j--;
            }

            list.set(j + 1, current);
        }
    }
}
