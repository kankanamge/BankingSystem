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
public interface BankInterface {
   
   public Long openCommercialAccount(Company company, int pin, double startingDeposit);
   
   public Long openConsumerAccount(Person person, int pin, double startingDeposit);
   
   public boolean authenticateUser(long accountNumber, int pin);
   
   public double getBalance(long accountNumber);
   
   public void credit(long accountNumber, double amount);
   
   public boolean debit(long accountNumber, double amount);
}
