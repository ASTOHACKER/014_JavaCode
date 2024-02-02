package pkg014_08.array2;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        String[] name = new String[3];
        int[] scoreMidterm = new int[3];
        int[] scoreFinal = new int[3];
        int[] quiz = new int[3];

        Scanner sc = new Scanner(System.in);


        for (int i = 0; i < name.length; i++) {
            System.out.print("Enter name for person " + (i + 1) + ": ");
            name[i] = sc.nextLine();
        }


        for (int i = 0; i < scoreMidterm.length; i++) {
            System.out.print("Enter midterm score for person " + (i + 1) + ": ");
            scoreMidterm[i] = sc.nextInt();

           
            sc.nextLine();
        }


        for (int i = 0; i < scoreFinal.length; i++) {
            System.out.print("Enter final score for person " + (i + 1) + ": ");
            scoreFinal[i] = sc.nextInt();

            
            sc.nextLine();
        }


        for (int i = 0; i < quiz.length; i++) {
            System.out.print("Enter quiz score for person " + (i + 1) + ": ");
            quiz[i] = sc.nextInt();

            
            sc.nextLine();
        }


        for (int i = 0; i < name.length; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.println("Name: " + name[i]);
            System.out.println("Midterm Score: " + scoreMidterm[i]);
            System.out.println("Final Score: " + scoreFinal[i]);
            System.out.println("Quiz Score: " + quiz[i]);
            int sum = (scoreMidterm[i]+scoreFinal[i]+quiz[i]);
            System.out.println("Sum = "+sum);
            System.out.println();
        }
    }
}
