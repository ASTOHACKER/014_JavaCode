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
public class Ex_3 {
    public static void main(String[] args) {
                Scanner kb = new Scanner(System.in);
        String name[] = new String[3];
        
        System.out.print("Input person 1 : ");
        name[0] = kb.nextLine();
        
        System.out.print("Input person 1 : ");
        name[1] = kb.nextLine();
        
        System.out.print("Input person 1 : ");
        name[2] = kb.nextLine();
        
        System.out.println("Person 1 : " + name[0]);
        System.out.println("Person 1 : " + name[1]);
        System.out.println("Person 1 : " + name[2]);
    }
}
