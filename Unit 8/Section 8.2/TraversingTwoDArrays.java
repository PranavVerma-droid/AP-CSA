public class TraversingTwoDArrays {
    public static void main(String[] args) {
        // Initialize a 4 x 5 Grid of 2D Array.
        int[][] grid = {
            {10, 20, 30, 40, 50},
            {50, 60, 70, 80, 90},
            {100, 110, 120, 130, 140},
            {150, 160, 170, 180, 190},
        };

        // Using Regular Loops
        for (int row = 0; row < grid.length; row++) {
            for (int column = 0; column < grid[row].length; column++) {
                System.out.println(grid[row][column]);
            }
            System.out.println();
        }

        // Using Enhanced For Loops
        for (int[] row : grid) {
            for (int value : row) {
                System.out.println(value);
            }
            System.out.println();
        }
    }
}
