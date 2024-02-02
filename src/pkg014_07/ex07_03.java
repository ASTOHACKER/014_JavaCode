/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg014_07;

/**
 *
 * @author STD
 */
public class ex07_03 {
    public static void main(String[] args) {
        Person mo = new Person();
        Person me = new Person();
        mo.fullname = "Maltika";
        mo.age = 25;
        me.fullname = "narudom";
        me.age = 19;
        System.out.println(mo.fullname+" "+mo.age+"maltika");
         System.out.println(me.fullname+" "+me.age+"narudom");
    }
    
}

class Person{
    String fullname;
    int age;
}