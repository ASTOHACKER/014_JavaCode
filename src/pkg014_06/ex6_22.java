/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author STD
 */
import java.util.Scanner;
public class ex6_22 {
    public static void main(String[] args){
        avg064();
    }
     public static void avg064(){
         Scanner avg = new Scanner(System.in);
         System.out.println("Please enter quantity: ");
         int avg1 = avg.nextInt();
          System.out.println("Please enter quantity: ");
         int avg2 = avg.nextInt();
         System.out.println("Please enter quantity: ");
         int avg3 = avg.nextInt();
         double avgcount = (avg1 + avg2 + avg3) /3;
          System.out.println("sum = " + avgcount);
     }
}
