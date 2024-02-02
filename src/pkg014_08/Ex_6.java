package pkg014_08;

import java.util.Scanner;

public class Ex_6 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String name[] = new String[5];

        for (int i = 0;i<=4;i++){
            System.out.println(name[i]);
            name[i] = kb.next();
        }

        for (int i =0;i<=4;i++){
            System.out.println("คนที่ "+(i+1)+"ชื่อ : " + name[i]);
        }

    }
}
