/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg014_07;

/**
 *
 * @author STD
 */
public class ex07_04 {
    public static void main(String[] args) {
        Person2 mo = new Person2();
        mo.fullname = "malthika janthong";
        mo.setage(201);
        mo.setage(25);
        int year = mo.calculatebirthyear();
        System.out.println(mo.fullname + " birthdate "+year);
    }
}
class Person2 {
    String fullname;
    int age;
    void setage(int newage){
        if (newage >= 1 && newage <= 200){
            age = newage;
        }
        else{
            System.err.println("Error age 1-200 only");
        }
    }
     int calculatebirthyear(){
        int yearold = 2566 - age;
        return yearold;
    }
}
