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
public abstract class Account implements AccountInterface {
   private AccountHolder accountHolder;
   private long accountNumber;
   private int pin;
   private double balance;
   
   protected Account(AccountHolder accountHolder, long accountNumber, int pin, double balance) {
      this.accountHolder = accountHolder;
      this.accountNumber = accountNumber;
      this.pin = pin;
      this.balance = balance;
   }
   
   @Override
   public AccountHolder getAccountHolder() {
     return this.accountHolder;
   }
   
   @Override
   public boolean validatePin(int attemptedPin) {
      return this.pin == attemptedPin;
   }
   
   @Override
   public double getBalance() {
      return this.balance;
   }
   
   @Override
   public long getAccountNumber() {
      return this.accountNumber;
   }
   
   @Override
   public void creditAccount(double amount) {
      this.balance += amount;
   }
   
   @Override
   public boolean debitAccount(double amount) {
      if (this.balance  >= amount) {
         this.balance -= amount;
         return true;
      } else {
         return false;
      }
   }
}
