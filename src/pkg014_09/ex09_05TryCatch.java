/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg014_09;

import java.util.Scanner;

/**
 *
 * @author STD
 */
public class ex09_05TryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str  = sc.next();
        int i = 0;
        try {
            i = Integer.parseInt(str);
        } catch (Exception e) {
            System.out.println("Catch Exception");
        }
        System.out.println(i);
    }
    
    //        Integer.parseInt(str);  เมธอดใน Java ใช้ในการแปลงการแสดงสตริงของจํานวนเต็มเป็นประเภทข้อมูลดั้งเดิม int จริง 
   //        เพื่อแปลงจาก string ให้เป็น int  ในกรณี ที่ กรอก ตัวเลขเข้าไป จากนั้นก็Catch ข้อความ "Catch Exception" ขึ้นมา
}
