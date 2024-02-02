package pkg014_08;

import java.util.Scanner;

public class ex08_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input amount student in class : ");
        int amount = sc.nextInt();
        int []unit = new int[amount];
        float tmp = 0,average = 0;
        int count = 0, min = 0, max = 0;

        for (int i =0;i < unit.length;i++){
            System.out.println("Input your score student "+ (i+1)+ " :");
            int score = sc.nextInt();
            unit[i] = score;
            tmp = unit[i] + tmp;
            count++ ;
            average = tmp / tmp;
            
            if (unit[i] > average){
                min++;
            }
            else {
                max++;
            }
            System.out.println("Average score = "+average);
            System.out.println("Amount low of score = "+min);
            System.out.println("Amount max of score = "+max);
        }

    }
}
