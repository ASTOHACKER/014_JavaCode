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
class Ex_2{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int score[] = new int[3];
        
        System.out.print("Input person 1 : ");
        score[0] = kb.nextInt();
        
        System.out.print("Input person 2 : ");
        score[1] = kb.nextInt();
        
        System.out.print("Input person 3 : ");
        score[2] = kb.nextInt();
        
        System.out.println("Person 1 : " + score[0]);
        System.out.println("Person 1 : " + score[1]);
        System.out.println("Person 1 : " + score[2]);
    }
}