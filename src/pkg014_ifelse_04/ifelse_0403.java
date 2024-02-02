/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg014_ifelse_04;
import java.util.Scanner;
/**
 *
 * @author pc
 */
public class ifelse_0403 {
    public static void main(String[] args){
        Scanner Keyboard = new Scanner(System.in);
        System.out.print("Input Salary");
        int Salary = Keyboard.nextInt();
        System.out.print("Input Age");
        int Age = Keyboard.nextInt();
        if (Age > 25){
            if (Salary>80000){
                System.out.println("Platinum");
            }
            else if(Salary>25000){
                System.out.println("Gold");
            }
            else if(Salary>=10000){
                System.out.println("Silver");
            }
            else{
                System.out.println("Not qualify");
            }
        }
        else{
            System.out.println("Not Allowed");
        }
    }
}
