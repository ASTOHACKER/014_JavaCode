package pkg014_08.array2;

public class ex08_02Array2D {
    public static void main(String[] args) {
        int[][] matrix = new int[5][3];
        System.out.println("Rows = " + matrix.length);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "    ");
            }
            System.out.println();  // Move to the next row after printing all columns
        }
    }
}
