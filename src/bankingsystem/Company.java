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
public class Company extends AccountHolder{
   private String companyName;
   
   public Company(String companyName, int taxId) {
      super(taxId);
      this.companyName = companyName;
   }
   
   public String getCompanyName() {
      return companyName;
   }
}
