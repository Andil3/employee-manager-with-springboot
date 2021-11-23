/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andile.employeemanagement.Enum;

/**
 *
 * @author Andile
 */
public enum AddressType {
    POSTAL("Postal"),RESIDENTIAL("Residential");
     private final String displayName;
   
   AddressType(final String displayName){
       this.displayName= displayName;
   }
   
    @Override
   public String toString(){
   return this.displayName;
   }
}
