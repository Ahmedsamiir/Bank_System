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
public class Bank_System {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Account a1 = new Account();
        Account a2 = new Account();
        Account a3 = new Account();
        
        a1.insert(4451238, "Mohamed", 10000);
        a1.deposit(12000);
        a1.withdraw(2000);
        a1.deposit(5000);
        a1.chechBalance();
        System.out.println("-----------------------------");
        
        a2.insert(9563145, "Belal", 100);
        a2.deposit(50);
        a2.withdraw(160);
        a2.chechBalance();
        
        System.out.println("-----------------------------");
        a3.insert(4451238, "Ahmed", 500);
        a3.deposit(550);
        a3.withdraw(10);
        a3.chechBalance();
        
        
       // a1.chechBalance();
       // a1.toString();
    }
    
}
