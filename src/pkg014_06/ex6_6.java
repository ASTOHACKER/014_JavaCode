package pkg014_06;
import java.util.Scanner;
public class ex6_6{
    public static void main(String[] args){
        float price = 220.50f;
        System.out.println("Input your cash :");
        Scanner sc = new Scanner(System.in);
        float cash = sc.nextFloat();
        double total = book(cash,price);
        System.out.println("My cash is "+total+"BATH");
    }
    public static double book(float cash,float price){
        if (cash >= price){
            cash -= price;
            System.out.println("OK BUY BOOK ");
        }
        return cash;
    }
}