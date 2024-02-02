/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg014_010;

import java.io.FileWriter;

/**
 *
 * @author STD
 */
public class ex10_02WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter fileobj = new FileWriter("FileHandingExample");
            fileobj.write("Welcome to Java ");
            fileobj.close();
            System.out.println("written to the file successfully ");
        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}
