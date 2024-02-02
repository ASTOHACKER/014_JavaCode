package pkg014_08;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int studentsCount = input.nextInt();
        int scores[] = new int[studentsCount];

        for (int i = 0; i < scores.length; i++) {
            System.out.println("Enter Score for student " + (i + 1) + ":");
            scores[i] = input.nextInt();
        }

        System.out.println("Output:");
        for (int c = 0; c < scores.length; c++) {
            System.out.println("Student " + (c + 1) + ": " + scores[c]);
            calculateGrade(scores[c]);
        }
    }

    private static void calculateGrade(int scores) {
        if (scores > 80) {
            System.out.println("A");
        } else if (scores > 70) {
            System.out.println("B");
        } else if (scores > 60) {
            System.out.println("C");
        } else if (scores > 50) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
