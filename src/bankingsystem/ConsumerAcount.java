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
public class ConsumerAcount extends Account{
   
   public ConsumerAcount(Person person, long accountNumber, int pin, double currentBalance) {
      super(person, accountNumber, pin, currentBalance);
   }
   
}
