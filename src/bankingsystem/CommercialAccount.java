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
public class CommercialAccount extends Account {
   private Person authorizedUsers;
   
   public CommercialAccount(Company company, long accountNumber, int pin, double startingDeposit) {
      super(company, accountNumber, pin, startingDeposit);
   }

   protected  void addAuthorizedUser(Person person) {
      this.authorizedUsers = new Person(person.getFirstName(), person.getLastName(), person.getIdNumber());
   }

   public boolean isAuthorizesUser(Person person) {
      return this.authorizedUsers.getIdNumber() == person.getIdNumber();
   }
}  

