package pkg014_010;

import java.io.File;

public class Ex10_04Delete {
    public static void main(String[] args) {
        File fileObj = new File("FileHandingExample.txt");
        if (fileObj.delete()){
            System.out.println("The file was successfully ");
        }
        else {
            System.out.println("The Specified file cannot be delete ");
        }
    }
    
}
