import java.util.Arrays;

public class Matrix {

    public static void main(String[] args) {


        int[][] matrix = generateMatrix(4);

        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                System.out.print(matrix[i][j] + " | ");

            }
            System.out.println();

        }


    }

    public static int[][] generateMatrix(int size) {
        int[][] array1 = new int[size][size];

        for (int i = 0; i < size ; i++) {
            array1[i][i] = 1;

        }
        return array1;
    }
}
