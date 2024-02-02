public class java07_01 {
    public String ID;
    public String name;
    public double exam;
    public double AffectiveScore;
    public double finals;
    public double totals;
    
    public java07_01(String ID,String name,double exam,double AffectiveScore,double finals){
    this.ID = ID;
    this.name = name;
    this.exam = exam;
    this.AffectiveScore = AffectiveScore;
    this.finals = finals;
    }

    public double totals() {
        double totalScore = exam + AffectiveScore + finals;
        return totalScore;
    }
    public void df() {
         System.out.println("Student ID: " + ID);
         System.out.println("Student Name: " + name);
         System.out.println("Exam Score: " + exam);
         System.out.println("Affective Score: " + AffectiveScore);
         System.out.println("Final Score: " + finals);
         System.out.println("Total Score: " + totals());
     }
    
    public static void main(String[] args) {
        java07_01 Student = new java07_01("014", "Narudom Okars", 40, 20, 30);
        Student.df();
    }
}
