package pkg014_ifelse_04;
public class ifelse_0405 {
    public static void main(String args[]) {
        int noOfPub;
        int fund = 0;
        double grade = 0;
        noOfPub = 1;
        System.out.println("Grade = "+grade);
        System.out.println("noOfPub = "+noOfPub);
        
        if(noOfPub>1){
            fund = 1000;
        }
        else if (noOfPub==1){
            fund = 500;
        }
        if (grade >= 3.75){
            System.out.println(fund+2000);
        }
        else if (grade >= 3.5){
            System.out.println(fund+1000);
        }
        else{
            System.out.println("Not Alloweds");
        }
    }
}
