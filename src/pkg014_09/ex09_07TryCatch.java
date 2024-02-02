/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg014_09;

import java.util.Scanner;
public class ex09_07TryCatch {
    public static void main(String[] args) {
       Scanner reader = new Scanner(System.in);
       int x;
        try {
            System.out.println("Enter number : ");
            x = reader.nextInt();
            System.out.println("Your number is "+x);}  
        catch (Exception ex) {
            System.out.println("Exception occurred"+ex);
            }
        }
    }
    
