/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Suphi Can
 */
public class SavingsAccount extends BankAccount {


    
    private static String accountType = "Saving";
    private double annualInterestRate = 0.15;
    SavingsAccount()
    {
        super();
        this.setBalance(3200.00);
        this.setOwner("Suphi Altintasli");
    }
    
        /**
     * @return the annualInterestRate
     */
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    
    public void withdrawal(double amount){
        double cBalance = this.getBalance();
        if(cBalance >= amount)
        {
            cBalance = cBalance - amount;
            this.setBalance(cBalance);
        }
        else
        {
            CheckingWpop popFrame = new CheckingWpop();
            popFrame.show();
            System.out.println("You don't have enough balance");
        }
    }
        
    public void depositMonthlyInterest(){
        double currentBalance = this.getBalance();
        currentBalance = currentBalance + (currentBalance * (annualInterestRate / 12));
       this.setBalance(currentBalance);
    }
    
    @Override
    public String toString() {
        return "Account Type: " + accountType + " Account/n" + 
                "Owner: " + this.getOwner() + "/n" +
                "Balance: " + this.getBalance();
    }

    @Override
    public void withdrawal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
