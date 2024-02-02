package pkg014_ifelse_04;
public class ifelse_0404 {
    public static void main(String args[]) {
        int noOfPub = 0;
        int fund = 0;
        double grade;
        boolean HaveFund;
        grade = 3.75;
        HaveFund = false;
        System.out.println("Grade = "+grade);
        System.out.println("noOfPub = "+noOfPub);
        if (grade>=3.75){
            HaveFund = true;
            fund = 2000;
        }
        else if (grade >= 3.5){
            HaveFund = true;
            fund = 1000;
        }
        else{
            System.out.println("Not Allowed");
        }
        
        if (HaveFund){
            if (noOfPub>1){
                System.out.println(fund+1000);
            }
            else if (noOfPub == 1){
                System.out.println(fund+500);
            }
            else{
                System.out.println(fund);
            }
        }
    }
}
