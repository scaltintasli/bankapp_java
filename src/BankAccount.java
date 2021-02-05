/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Suphi Can
 */
abstract class BankAccount {


    private String owner;
    private double balance;
    
    public void deposit(double m){
        balance = balance + m;
    }
    
    abstract public void withdrawal();


    
//    BankAccount(String name, double num) {
//        this.owner = name;
//        this.balance = num;
//    }
    
    /***@return the owner*/
    public String getOwner() {
        return owner;
    }

    /***@return the balance*/
    public Double getBalance() {
        return balance;
    }

    /*** @param balance the balance to set*/
    public void setBalance(Double balance) {
        this.balance = balance;
    }
    
    public void setOwner(String n){
        this.owner = n;
    }
}

