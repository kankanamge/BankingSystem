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
public class Account {
   private AccountHolder accountHolder;
   private long accountNumber;
   private int pin;
   private double balance;
   
   protected Account(AccountHolder accountHolder, long accountNumber, int pin, double startingDeposit) {
   }
   
   public AccountHolder getAccountHolder() {
   }
   
   public boolean validatePin(int attemptedPin) {
   }
   
   public double getBalance() {
      return 0.0;
   }
   
   public long getAccountNumber() {
   }
   
   public void creditAccount(double amount) {
   }
   
   public boolean debitAccount(double amount) {
   }
}
