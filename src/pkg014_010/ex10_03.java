package pkg014_010;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex10_03 {
    public static void main(String[] args) {
        try {
            File fileObj = new File("File1.txt");
            Scanner scanObj = new Scanner(fileObj);
            while (scanObj.hasNextLine()) {
                String data = scanObj.nextLine();
                System.out.println(data);
            }
            scanObj.close();
        } catch (FileNotFoundException except) {
            System.out.println("Error: File not found");
            except.printStackTrace();
        }
    }
}
