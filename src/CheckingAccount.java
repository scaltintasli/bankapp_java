
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Suphi Can
 */
public  class CheckingAccount extends BankAccount {
    private static String accountType = "Checking";
    private double insufficientFundsFee = 35.00;
    
    public void processCheck(double check)
    {
        check = check + this.getBalance();
        this.setBalance(check);
    }
    
    CheckingAccount()
    {
        super();
        this.setBalance(1200.00);
        this.setOwner("Suphi Altintasli");
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
            cBalance = cBalance - insufficientFundsFee;
            this.setBalance(cBalance);
            System.out.println("You don't have enough balance");
            CheckingWpop popFrame = new CheckingWpop();
            popFrame.show();
        }
    }
    
    double getFundFee()
    {
        return insufficientFundsFee;
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
