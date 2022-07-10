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
public interface TransactionInterface {
   
   public double getBalance();
   
   public void credit(double amount);
   
   public boolean debit(double amount);
}
