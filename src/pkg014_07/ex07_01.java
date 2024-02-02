//package pkg014_07;
//public class ex07_01 {
//    int total; 
//    static  int ex07_01(int a,int b) {
//       return a + b;
//    }
//    public static void main(String[] args) {
//        ex07_01  Myobj = new ex07_01();
//        
//        System.out.println(ex07_01(1, 2));
//        
//    }
//}


package pkg014_07;

import java.util.Scanner;

public class ex07_01 {
    public static void main(String[] args) {
        System.out.println("Enter Product price >> ");
        Scanner scan = new Scanner(System.in);
        double productprice = scan.nextDouble();
        double totalprice = productprice + (0.07 * productprice);
        System.out.println("Product price ="+productprice+"bath");
        System.out.println("total price"+totalprice+"bath");
    }
}
