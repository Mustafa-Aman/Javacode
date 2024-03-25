public class SavingsAccount {
  
    int balance;
    
  
  
    public SavingsAccount(int initialBalance){
      balance = initialBalance;
    }
      // System.out.println("Hello!");
      // System.out.println("Your balance is "+savings.balance);
      public void checkBalance(){
        System.out.println("Hello!");
        System.out.println("Your balance is " + balance);
      }
      public void deposit(int amountToDeposit){
        int newDeposit = balance + amountToDeposit;
        balance = newDeposit;
        System.out.print("You just deposited " + amountToDeposit);
      }
      public int withdraw(int amountToWithdraw){
        int newWithdraw = balance - amountToWithdraw;
        balance = newWithdraw;
        return amountToWithdraw;
      }
    public static void main(String[] args){
      SavingsAccount savings = new SavingsAccount(2000);
      
      savings.checkBalance();
      savings.deposit(500);
      savings.withdraw(200);
      savings.checkBalance();
    }
}