package pkg014_08.array2;

import java.util.Scanner;

public class ex08_06Array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] num = new int[3][4];

        for (int i = 0; i < num.length; i++) {
            System.out.println("Enter Your Numbers for Row " + (i + 1) + ":");
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = sc.nextInt();
            }
        }

        System.out.println("**** Show Data **** ");
        for (int i = 0; i < num.length; i++) {
            int rowSum = 0; // Initialize sum for each row
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j] + "     ");
                rowSum += num[i][j];
            }
            System.out.println("Row Sum: " + rowSum); // Display the sum for each row
        }

        System.out.println("**** Column Sums **** ");
        for (int j = 0; j < num[0].length; j++) {
            int colSum = 0; // Initialize sum for each column
            for (int i = 0; i < num.length; i++) {
                colSum += num[i][j];
            }
            System.out.println("Column " + (j + 1) + " Sum: " + colSum);
        }
    }
}
