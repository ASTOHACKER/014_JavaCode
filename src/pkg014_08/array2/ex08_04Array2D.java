package pkg014_08.array2;

import java.util.Scanner;

public class ex08_04Array2D {
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
            int rowMax = num[i][0]; // Assume the first element is the maximum in the row
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j] + "     ");
                if (num[i][j] > rowMax) {
                    rowMax = num[i][j];
                }
            }
            System.out.println("Row Max: " + rowMax); // Display the maximum for each row
        }

        System.out.println("**** Column Max **** ");
        for (int j = 0; j < num[0].length; j++) {
            int colMax = num[0][j]; // Assume the first element is the maximum in the column
            for (int i = 0; i < num.length; i++) {
                if (num[i][j] > colMax) {
                    colMax = num[i][j];
                }
            }
            System.out.println("Column " + (j + 1) + " Max: " + colMax);
        }
    }
}
