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
public abstract class AccountHolder {
   private int idNumber;
   
   public AccountHolder(int idNumber) {
      this.idNumber = idNumber;
   }
   
   public int getIdNumber() {
      return idNumber;
   }
   
}
