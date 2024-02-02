/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg014_07;

/**
 *
 * @author STD
 */
public class xam {
    public String Name;
    public int ID;
    public xam(String Name,int ID){
        this.Name = Name;
        this.ID = ID;
    }
    public void df(){
        System.out.println(ID);
        System.out.println(Name);
        if (Name == "012"){
            System.out.println("You already 12 num");
        }
    }
    public static void main(String[] args) {
         xam student = new xam("012",1);
         student.df();
    }
}
    
