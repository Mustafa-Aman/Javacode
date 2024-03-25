// carloan project 
// auther : Mustafa Aman
// Date: 03/15/2024
public class Carloan {
    public static void main(String[] args){
        int carloan = 10000;
        int loanlengh = 3;
        int interestRate = 5;
        int downPayment = 2000;
        if ((loanlengh <= 0) || (interestRate <= 0)){
            System.out.println("You must have a valid car loan");
        }else if (downPayment > carloan){
            System.out.println("The car can be pay in full");
        }else{
            int remaningPayment = carloan - downPayment;
            int months = loanlengh * 12;
            int monthlyBalance = remaningPayment / months;
            int interest = (monthlyBalance * interestRate) / 100;
            int monthlyPayment = monthlyBalance + interest;
            System.out.println(monthlyPayment);
            }
        }
        
}
