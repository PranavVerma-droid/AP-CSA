public class MaxMinDouble {
    private static double findMax(double [] values) {
        double max = values[0];

        for (int index = 1; index < values.length; index++) {
            if (values[index] > max) {
                max = values[index];
            }
        }
        return max;
    }

    private static int findMax(int [] values) {
        int max = values[0];

        for (int index = 1; index < values.length; index++) {
            if(values[index] > max) {
                max = values[index];
            }
        }
        return max;
    }

    private static int findMin(int [] values) {
        int min = Integer.MAX_VALUE;

        for (int currentValue : values) {
            if (currentValue < min) {
                min = currentValue;
            }
        }

        return min;
    }

    public static void main(String[] args) {
        double [] array1 = {10.0, 10.1, 10.2};
        double maxValue = findMax(array1);

        int [] array2 = {10, 20, 30};
        int minValue = findMin(array2);
        int maxValue2 = findMax(array2);

        System.out.println(maxValue);
        System.out.println(maxValue2);
        System.out.println(minValue);
    }
}