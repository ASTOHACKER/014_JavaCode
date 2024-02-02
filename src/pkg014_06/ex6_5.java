import java.util.Scanner;
public class ex6_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input you number :");
        int num1 = sc.nextInt();
        System.out.println("Input you number :");
        int num2 = sc.nextInt();
        int ans = sum(num1,num2);
        System.out.println(ans);
    }
    public static int sum(int num1,int num2){
        return (num1 + num2)/2;
    }
}

