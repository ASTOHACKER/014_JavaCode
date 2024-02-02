/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg014_010;

import java.io.File;
import java.io.IOException;

public class ex10_01 {
    public static void main(String[] args) {
        try {
            File fileObj = new File("FileHandingExample.txt");
            if (fileObj.createNewFile()){
                System.out.println("File created "+fileObj.getName());
            } else{
                System.out.println("File Already Exists");
            }
        } catch (IOException except) {
            System.out.println("Error");
            except.printStackTrace();
        }
    }
}
