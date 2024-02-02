/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg014_08;

import java.util.Scanner;

/**
 *
 * @author STD
 */
public class Ex_4 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        int score[] = new int[5];

        for (int i = 0;i<=4;i++){
            System.out.println("ระบุคะแนนคนที่ : "+(i+1)+"-->");
            score[i] = kb.nextInt();
        }
        for (int i = 0;i<=4;i++){
            System.out.println("คะแนน "+score[i]);
        }

    }
}
