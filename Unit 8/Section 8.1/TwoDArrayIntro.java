public class TwoDArrayIntro {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // Regular Arrays use ONE set of brackets.
        int[] oldGrades;

        // 2D arrays use TWO sets of brackets.
        // First Bracket: Rows
        // Second Bracket: Columns

        int [][] grades = {
            {10, 20, 30, 40, 50},
            {10, 20, 30, 40, 50},
            {10, 20, 30, 40, 50},
            {10, 20, 30, 40, 50},
            {10, 20, 30, 40, 50} };

        // Number of Rows:
        int noOfRowsInGrades = grades.length;

        // Number of Columns in ROW 1:
        int noOfColumnsInRow1InGrades = grades[0].length;

        // Number of Columns in ROW 2:
        int noOfColumnsInRow2InGrades = grades[1].length;


        // Get Items from 2D Arrays

        int row1column1 = grades[0][0];
        System.out.println(row1column1);


        // Update Items in 2D Arrays

        grades[0][0] = 20;
        System.out.println(grades[0][0]);

    }
}