package pkg014_08;

import java.util.Scanner;

public class Ex_5 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int score[] = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter score for student " + (i + 1) + ": ");
            score[i] = kb.nextInt();
        }

        int max_s = 0;
        int max_p = 0;

        for (int i = 0;i<=4;i++){
            if (score[i] >= max_p){
                max_p = score[i];
                max_p = i;
            }
        System.out.println("คะแนนคนที่ "+ (i+1)+"คือ"+score[i]);
        }
        System.out.println("คะแนนมากที่สุด คือ "+score[max_p]);
    }
}
