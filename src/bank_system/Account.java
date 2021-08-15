/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank_system;

/**
 *
 * @author face
 */
public class Account {
    
    private int accountNumber;
    private String name;
    private float amount;
    
    public void insert(int accountNo, String name, float amt){
    this.accountNumber = accountNo;
    this.name = name;
    this.amount = amt;
    }
    
    public void deposit(float amt){
    this.amount = this.amount + amt;
    System.out.println(this.amount + " deposited");
    }
    
    public void withdraw(float amt){
        if(this.amount < amt){
        System.out.println("Insufficient Balance");
        }
        else{
            this.amount = this.amount - amt;
            System.out.println(this.amount + " withdrawn");
        }
    }
    
    public void chechBalance(){
    System.out.println("Balance = " + this.amount);
    }

    
    public String toString() {
        return "Account{" + "accountNumber=" + accountNumber + ", name=" + name + ", amount=" + amount + '}';
    }
    
    
    
    
}
