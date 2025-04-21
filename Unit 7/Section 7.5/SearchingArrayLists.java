import java.util.ArrayList;

public class SearchingArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<Integer>();
        int[] myList2 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Adding Stuff to the ArrayList
        for(int i = 0; i <= 10; i = i + 1) {
            myList.add((int) i);

        }

        // Number (to Search) - in ArrayList & in Array

        int num = 5;

        // For Arraylist (myList)

        for(int index = myList.size() - 1; index >= 0; index--) {
            if (myList.get(index) == num) {
                System.out.println(index);
            }
        }

        // For Arrays (myList2)

        for(int index = myList2.length - 1; index >= 0; index--) {
            if (myList2[index] == num) {
                System.out.println(index);
            }
        }

        // Using Classes Below.
        int index1 = searcherInArrayLists(num, myList);
        int index2 = searcherInArrays(num, myList2);

        System.out.println(index1);
        System.out.println(index2);
        

    }

    public static int searcherInArrays(int magicNumber, int[] inputNumbers) {
        for (int index = 0; index < inputNumbers.length; index++) {
            if (inputNumbers[index] == magicNumber) {
                return index;
            }
        }

        return -1;
    }

    public static int searcherInArrays(double magicNumber, double[] inputNumbers) {
        for (int index = 0; index < inputNumbers.length; index++) {
            if ((double) inputNumbers[index] == magicNumber) {
                return index;
            }
        }

        return -1;
    }

    public static int searcherInArrayLists(int magicNumber, ArrayList<Integer> inputNumbers) {
        for (int index = 0; index < inputNumbers.size(); index++) {
            if (inputNumbers.get(index) == magicNumber) {
                return index;
            }
        }

        return -1;
    }

    public static int searcherInArrayLists(double magicNumber, ArrayList<Double> inputNumbers) {
        for (int index = 0; index < inputNumbers.size(); index++) {
            if ((double) inputNumbers.get(index) == magicNumber) {
                return index;
            }
        }

        return -1;
    }
}