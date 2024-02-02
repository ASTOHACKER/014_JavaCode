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
public class java07_02_2 {
    public static void main(String[] args) {
        System.out.print("Enter Product Price >>");
        Scanner sc = new Scanner(System.in);
        double productprice = sc.nextDouble();
        ex07_02 p =new ex07_02();
        double total = p.calproduct(productprice);
        total = total + productprice;
        System.out.println("total of price = "+total);
    }
    
}
