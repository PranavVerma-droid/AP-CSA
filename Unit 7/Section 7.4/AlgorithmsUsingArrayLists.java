import java.util.ArrayList;

@SuppressWarnings("unused")
public class AlgorithmsUsingArrayLists {
    
    private double findMax(ArrayList<Double> values) {
        double max = values.get(0);

        for (int index = 1; index < values.size(); index++) {
            if (values.get(index) > max) {
                max = values.get(index);
            }
        }

        return max;
    }

    private int findMin(ArrayList<Integer> values) {
        int min = Integer.MAX_VALUE;

        for (int currentValue : values) {
            if (currentValue < min) {
                min = currentValue;
            }
        }

        return min;
    }

    private int findSum(ArrayList<Integer> values) {
        int total = 0;
        for (int currentValue : values) {
            total = total + currentValue;
        }

        return total;
    }
}
