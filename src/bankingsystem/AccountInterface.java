/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingsystem;

/**
 *
 * @author skanlk
 */
public interface AccountInterface {
   
   public AccountHolder getAccountHolder();
   
   public boolean validatePin(int attemptedPin);
   
   public double getBalance();
   
   public long getAccountNumber();
   
   public void creditAccount(double amount);
   
   public boolean debitAccount(double amount);
}
