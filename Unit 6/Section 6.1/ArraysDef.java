public class ArraysDef {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // Created a New Array: Like this:
        // [0, 0, 0, 0, 0]
        int [] listOne = new int[5];

        // Modified the 2nd Index of the List, Like this:
        // [0, 0, 1, 0, 0]
        listOne[2] = 1;

        // Modified the 3nd Index of the List, Like this:
        // [0, 0, 1, 3, 0]
        listOne[3] = listOne[2] * 3;

        // This line will cause an "ArrayIndexOutOfBoundsException"
        // Because the Index 5 is not in the given array (max is 4).
        // listOne[5] = 13;

        Mutable [] listTwo = new Mutable [3];

        listTwo[1] = new Mutable(33);
        listTwo[0] = new Mutable(listTwo[1].getValue() - 3);

        System.out.print("[" + listOne[0] + ", ");
        System.out.print(listOne[1] + ", ");
        System.out.print(listOne[2] + ", ");
        System.out.print(listOne[3] + ", ");
        System.out.println(listOne[4] + "]");

        // Initializers

        // int: 0
        // reference type: null
        // double: 0.0
        // boolean: false

        double [] grades = {70.5, 88.2, 93.7, 98.7};
        String [] petNames = {"Ember", "Phoenix"};
    }
}