/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingsystem;

import java.util.LinkedHashMap;

/**
 *
 * @author skanlk
 */
public class Bank {
   private LinkedHashMap<Long, Account> accounts;
   
   public Bank() {
   
   }
   private Account getAccount(Long accountNumber) {
      return null;
   }
   
   public Long openCommercialAccount(Company company, int pin, double startingDeposit) {
      return -1L;
   }
   public Long openCunsumerAccount(Person person, int pin, double startingDeposit) {
      return -1L;
   }
   public boolean authenticateUse(Long accountNumber, int pin) {
      return true;
   }
   public double getBalance(Long accountNumber) {
      return -1;
   }
   public void credit(Long accountNumber, double amount) {
   }
   public boolean debit(Long accountNumber, double amount) {
      return true;
   }
}
