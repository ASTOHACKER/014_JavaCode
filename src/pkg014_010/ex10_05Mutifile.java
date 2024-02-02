package pkg014_010;

import java.io.File;

public class ex10_05Mutifile {
    public static void main(String[] args) {
        File fileObj = new File("file1.txt");
        if (fileObj.exists()){
            System.out.println("Filename:  "+fileObj.getName());
            System.out.println("File_Path:  "+fileObj.getAbsolutePath());
            System.out.println("file_readle : "+fileObj.canRead());
            System.out.println("file_writeale : "+fileObj.canWrite());
             System.out.println("file_Size in byte  : "+fileObj.length());
        }else {
            System.out.println("File does not exist ");
        }
    }
    
}
