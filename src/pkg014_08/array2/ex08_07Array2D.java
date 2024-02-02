package pkg014_08.array2;

import java.util.Scanner;

public class ex08_07Array2D {
    public static void main(String[] args) {
        int count = 0;
        int tmpprice = 0;
        int sumtmp = 0;
        int sum = 0; // Initialize the total sum
        Scanner sc = new Scanner(System.in);

        // Corrected the 2D array initialization
        String[][] pro = new String[][]{
            {"p001", "computer"},
            {"p002", "monitor 15"},
            {"p003", "monitor 17"},
            {"p004", "printer"}
        };
        int[] price = new int[]{19000, 3200, 3800, 2300};

        System.out.println("*** Select Product *** ");
        for (int i = 0; i < pro.length; i++) {
            for (int j = 0; j < pro[i].length; j++) {
                System.out.print(pro[i][j] + "\t");
            }
            System.out.println("\t" + price[i]);
        }
        System.out.println("\n *************");

        while (true) {
            System.out.println("Enter Your id: ");
            String id = sc.nextLine();
            for (int i = 0; i < pro.length; i++) {
                if (id.equals(pro[i][0])) {
                    tmpprice = price[i];
                    System.out.print("Enter your amount: ");
                    int amount = sc.nextInt();
                    sumtmp = tmpprice * amount;
                    sum = sum + sumtmp;
                    System.out.println("Total = " + sum);
                }
            }
            System.out.println("Do you want to continue (y/n): ");
            sc.nextLine();  // Consume the newline left by nextInt()
            String ans = sc.nextLine();
            if (ans.equals("n")) {
                break;
            }
        }
    }
}
