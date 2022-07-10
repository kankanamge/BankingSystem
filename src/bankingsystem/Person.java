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
public class Person extends AccountHolder {
   private String firstName;
   private String lastName;
   
   public Person(String firstName, String lastName, int idNumber) {
      super(idNumber);
      this.firstName = firstName;
      this.lastName = lastName;
   }
   
   public String getFirstName() {
      return this.firstName;
   }
   
   public String getLastName(){
      return this.lastName;
   }
}
