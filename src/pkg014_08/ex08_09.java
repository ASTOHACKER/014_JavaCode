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
public class ex08_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a[] = new double[5];
        double sum = 0;
        for (int i = 1;i<a.length;i++){
            System.out.println("Enter a a["+i+"] : ");
            a[i] = sc.nextDouble();
            sum += a[i];
        }
        System.out.println("Sum Array = "+sum);
    }
}
