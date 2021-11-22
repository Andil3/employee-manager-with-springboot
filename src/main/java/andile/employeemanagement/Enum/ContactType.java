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

public enum ContactType {
   EMAIL("Email"),
   LANDLINE("Land Line"),
   MOBILENUMBER("Mobile number");
   private final String displayName;
   
   ContactType(final String displayName){
       this.displayName= displayName;
   }
   @Override
   public String toString(){
   return this.displayName;
   }
}
