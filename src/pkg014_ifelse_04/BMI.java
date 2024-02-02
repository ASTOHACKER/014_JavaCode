/*

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg014_ifelse_04;

/**
 *
 * @author pc
 */
import java.util.Scanner;
public class BMI {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("BMI");
        System.out.println("Input Height");
        double Height = input.nextDouble();
        System.out.println("Input Weight");
        double Weight = input.nextDouble();
        
        
        double bmi = Weight / (Height * Height);
        System.out.println(bmi*10000);
    }
}

//
//public class BMI {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Welcome to the BMI Calculator!");
//
//        System.out.print("Enter your weight in kilograms: ");
//        double weight = input.nextDouble();
//
//        System.out.print("Enter your height in meters: ");
//        int height = (int) input.nextDouble();
//
//        double bmi = (weight / height)*height;
//
//        System.out.println("Your BMI is: " + bmi);
//    }
//}
