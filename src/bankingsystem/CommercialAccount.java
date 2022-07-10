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
public class CommercialAccount {
   private Person authorizedUsers;
   
   public void CommercialAccount(Company company, long accountNumber, int pin, double startingDeposit) {
      
   }
   protected  void addAuthorizedUser(Person person) {
   }
   public boolean isAuthorizesUser(Person person) {
      return true;
   }
}  

