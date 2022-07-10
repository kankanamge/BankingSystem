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
public class Transaction implements TransactionInterface {
   private Long accountNumber;
   private Bank bank;
   
   public Trasaction(Bank bank, Long accountNumber, int attemptedPin) {
      this.bank = bank;
      this.accountNumber = accountNumber;
      this.bank.getAccount(accountNumber);   
   }
   
   @Override
   public double getBalance() {
      return this.bank.getBalance(this.accountNumber);
   }
   
   @Override
   public void credit(double amount) {
      this.bank.credit(this.accountNumber, amount);
   }
   
   @Override
   public boolean debit(double amount){
      return this.bank.debit(this.accountNumber, amount);
   }
   
}
