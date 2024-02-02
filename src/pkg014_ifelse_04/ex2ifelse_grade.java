/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg014_ifelse_04;

/**
 *
 * @author pc
 */
public class ex2ifelse_grade {
    public static void main(String[]args){
        int score = 76;
        char grade;
        if (score >= 90){
            grade = 'A'; 
        }
        else if (score >= 80){
            grade = 'B'; 
        }
        else if (score >= 70){
            grade = 'C'; 
        }
        else if (score >= 60){
            grade = 'D'; 
        }
        else{
            grade = 'F';
        }
        System.out.println(grade);
    }
}
