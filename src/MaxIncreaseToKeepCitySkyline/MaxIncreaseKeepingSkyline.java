package MaxIncreaseToKeepCitySkyline;

import java.util.Arrays;

public class MaxIncreaseKeepingSkyline {
    private static int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] leftRight = new int[grid.length];
        int[] topBottom = new int[grid[0].length];
        int maxLeftRight = 0;
        int maxTopBottom = 0;
        int answer = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (leftRight[i] == 0 || leftRight[i] < grid[i][j]) {
                    leftRight[i] = grid[i][j];
                }
                if (topBottom[j] == 0 || topBottom[j] < grid[i][j]) {
                    topBottom[j] = grid[i][j];
                }
            }
        }
        for (int value : leftRight) {
            if (maxLeftRight < value) maxLeftRight = value;
        }
        for (int value : topBottom) {
            if (maxTopBottom < value) maxTopBottom = value;
        }
        System.out.println("The skyline viewed from top or bottom is: " + Arrays.toString(topBottom));
        System.out.println("The skyline viewed from left or right is: " + Arrays.toString(leftRight));
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (topBottom[j] < leftRight[i]) {
                    if (topBottom[j] > grid[i][j]) {
                        answer += topBottom[j] - grid[i][j];
                    }
                } else if (leftRight[i] > grid[i][j]) {
                    answer += leftRight[i] - grid[i][j];
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int answer;
        int[][] grid = {{3, 0, 8, 4}, {2, 4, 5, 7}, {9, 2, 6, 3}, {0, 3, 1, 0}};
        System.out.println("The grid is: ");
        for (int[] ints : grid) {
            System.out.println(Arrays.toString(ints));
        }
        answer = maxIncreaseKeepingSkyline(grid);
        System.out.println("Answer: " + answer);
    }
}
