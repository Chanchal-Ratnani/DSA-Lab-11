public class DiagonalSumCalculator {

    public static int calculateLeftDiagonalSum(int[][] matrix) {
        int n = matrix.length; 
        int leftDiagSum = 0;
        for (int i = 0; i < n; i++) {
            leftDiagSum += matrix[i][i]; 
        }
        return leftDiagSum;
    }

    public static int calculateRightDiagonalSum(int[][] matrix) {
        int n = matrix.length; 
        int rightDiagSum = 0;
        for (int i = 0; i < n; i++) {
            rightDiagSum += matrix[i][n - 1 - i]; 
        }
        return rightDiagSum;
    }

    public static void main(String[] args) {
        int[][] squareMatrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Left Diagonal Sum: " + calculateLeftDiagonalSum(squareMatrix)); 
        System.out.println("Right Diagonal Sum: " + calculateRightDiagonalSum(squareMatrix)); 
    }
}