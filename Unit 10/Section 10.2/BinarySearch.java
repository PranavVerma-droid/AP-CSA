import java.util.ArrayList;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int [] myArr = {1, 2, 3, 4, 5, 5, 5, 6, 7, 8};
        ArrayList<Integer> myArrList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 5, 5, 6, 7, 8));

        int elemToFind = 2;

        int elemToFindPos = binarySearchRecur(myArr, elemToFind, 0, myArr.length - 1);
        int elemToFindPos2 = binarySearchRecur(myArrList, elemToFind, 0, myArrList.size() - 1);

        System.out.print("Element to Find: ");
        System.out.println(elemToFind);

        System.out.print("Position Found in: ");
        System.out.println(elemToFindPos);

        System.out.print("Element Found: ");
        System.out.println(myArr[elemToFindPos]);

        System.out.print("Position Found in: ");
        System.out.println(elemToFindPos2);
        
        System.out.print("Element Found: ");
        System.out.println(myArrList.get(elemToFindPos2));
    }

    public static int binarySearch(int[] arr, int target, int startIndex, int stopIndex) {
        int midPos;

        while (startIndex <= stopIndex) {
            midPos = (stopIndex + startIndex) / 2;
            if (arr[midPos] < target) {
                startIndex = midPos + 1;
            } else if (arr[midPos] > target) {
                stopIndex = midPos - 1;
            } else {
                return midPos;
            }
        }

        return -1;
    }

    public static int binarySearch(ArrayList<Integer> arr, int target, int startIndex, int stopIndex) {
        int midPos;

        while (startIndex <= stopIndex) {
            midPos = (startIndex + stopIndex) / 2;

            if (arr.get(midPos) < target) {
                startIndex = midPos + 1;
            } else if (arr.get(midPos) > target) {
                stopIndex = midPos - 1;
            } else {
                return midPos;
            }

        }

        return -1;
    }

    public static int binarySearchRecur(int[] arr, int target, int startIndex, int stopIndex) {
        int midPos;

        if (startIndex > stopIndex) {
            return -1;
        } else {
            midPos = (startIndex + stopIndex) / 2;

            if (arr[midPos] < target) {
                return binarySearchRecur(arr, target, midPos + 1, stopIndex);
            } else if (arr[midPos] > target) {
                return binarySearchRecur(arr, target, startIndex, midPos - 1);
            } else {
                return midPos; 
            }
        }
    }

    public static int binarySearchRecur(ArrayList<Integer> arr, int target, int startIndex, int stopIndex) {
        int midPos;

        if (startIndex > stopIndex) {
            return -1;
        } else {
            midPos = (startIndex+ stopIndex) / 2;

            if (arr.get(midPos) > target) {
                return binarySearchRecur(arr, target, startIndex, midPos - 1);
            } else if (arr.get(midPos) < target) {
                return binarySearchRecur(arr, target, midPos + 1, stopIndex);
            } else {
                return midPos;
            }
        }
    }
}

