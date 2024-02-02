/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pc
 */
public class ex5_6 {
    public static void main(String[] args) {
int score[] = {40, 50, 80, 60};
int m = score.length, grade, sumGrade = 0;
double gpa = 0;
for (int c = 0; c<m; c++) {
int s = score[c];
if (s >= 80) grade = 4;
else if (s >= 70) grade = 3;
else if (s >= 60) grade = 2;
else if (s >= 50) grade = 1;
else grade = 0;
sumGrade += grade;
System.out.println("Subject" + (c + 1) +" Score="+s+", Grade = " + grade);
}
gpa = (double)sumGrade/m;
System.out.println("Average grade = " + gpa);
}
}

