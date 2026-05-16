public class MatrixTranspose {
    public static void main(String[] args) {
        int[][] A = { {1, 2, 3}, {4, 5, 6} };

        int rows = A.length, cols = A[0].length;
        int[][] result = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = A[i][j];
            }
        }

        System.out.println("Transpose:");
        for (int[] row : result) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }
    }
}
