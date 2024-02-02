/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg014_07;

import java.util.Scanner;

/**
 *
 * @author STD
 */
public class ex07_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Your score");
        float score = sc.nextInt();
        System.out.println("Input Your score2");
        float score2 = sc.nextInt();
        grade tmp = new grade();
        float ans = tmp.checkscore(score2, score2);
        tmp.showgrade(ans);
    }
}
class grade{
    public float score;
    public  String name;
    void showgrade(float score){
        if (score >= 50){
            System.out.println("excelent");
        }
        else{
            System.out.println("Fair");
        }
    }
    float checkscore(float score1,float score2){
        return score1+score2;
    }
}

