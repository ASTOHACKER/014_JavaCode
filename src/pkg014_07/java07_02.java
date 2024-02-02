 public class java07_02 {
    public static void main(String[] args) {
        java07_01 student = new  java07_01("014", "Narudom", 40, 20, 30);
        student.df();
        calculateGrade(student.totals());
    }

    public static void calculateGrade(double totalScore) {
        char grade;
        if (totalScore >= 80) {
            grade = 'A';
        } else if (totalScore >= 70) {
            grade = 'B';
        } else if (totalScore >= 60) {
            grade = 'C';
        } else if (totalScore >= 50) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Grade: " + grade);
    }
}