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
public class Transaction {
   private Long accountNumber;
   private Bank bank;
   
   public Trasaction(int Bank, Long accountNumber, int attemptedPin) {
      
   }
   
   public double getBalance() {
      return 0.0;
   }
   
   public void credit(double amount) {
   }
   
   public boolean debit(double amount){
      return true;
   }
   
}
