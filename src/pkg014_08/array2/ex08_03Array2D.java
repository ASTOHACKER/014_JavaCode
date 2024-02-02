/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg014_08.array2;

/**
 *
 * @author STD
 */
public class ex08_03Array2D {
    public static void main(String[] args) {
        int [][] matrix = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int sum = 0;
        for (int i = 0;i<matrix.length;i++){
            for (int j = 0;j<matrix[i].length;j++){
                sum += matrix[i][j];
            }
            System.out.println(sum);
        }
    }
}
