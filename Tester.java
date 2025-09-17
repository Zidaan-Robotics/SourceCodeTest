public class Tester {


    public static void main(String[] args) {
        int[][] matrix =
                {{1, 2, 3, 4, 5, 6}, {4, 5, 6, 3, 7, 2}, {27, 8, 9, 5, 3, 21}, {73, 2, 19, 5, 1, 8},
                        {47, 9, 9, 5, 0, 22}, {78, 86, 1, 4, 1, 21}, {73, 18, 2, 2, 5, 11}};

        int numRows = 6;
        int numCols = 7;

        int[][] matrix2 = MatrixExample.generateRandomMatrix(numRows, numCols);
        int[][] result = MatrixExample.multiplyMatrices(matrix, matrix2);

        MatrixExample.printMatrix(matrix);
        System.out.println();
        MatrixExample.printMatrix(matrix2);

        System.out.println("result length: " + result.length + " x " + result[0].length);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }

}
