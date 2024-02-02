/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
public class ex6_7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input you price :");
        float price = sc.nextFloat();
        System.out.println("Input you unit :");
        float unit = sc.nextFloat();
        double total = book(unit,price);
        System.out.println("My cash is "+total+"BATH");
    }
    public static double book(float unit,float price) {
        Scanner sc = new Scanner(System.in);
        float amount = unit * price;
        System.out.println("Your price of product is :"+amount);
        System.out.println("Input your cash :");
        float cash = sc.nextFloat();
        if (cash >= amount){
            cash -= amount;
            System.out.println("OK .. BUY Book");
        }
        else{
            System.out.println("YOU MUST BY CARD");
        }
        return cash;
    }
}
