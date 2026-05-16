public class MatrixSubtraction {
    public static void main(String[] args) {
        int[][] A = { {9, 8}, {7, 6} };
        int[][] B = { {5, 4}, {3, 2} };

        int rows = A.length, cols = A[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }

        System.out.println("Matrix Subtraction:");
        for (int[] row : result) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }
    }
}
