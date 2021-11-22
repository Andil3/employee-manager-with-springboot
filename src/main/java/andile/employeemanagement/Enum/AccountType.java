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
public enum AccountType {
    FACEBOOK("Facebook"),TWITTER("Twitter"),INSTAGRAM("Instagram"),LINKEDIN("LinkedIn"),WHATSAPP("Whatapp");
     private final String displayName;
   
   AccountType(final String displayName){
       this.displayName= displayName;
   }
   @Override
   public String toString(){
   return this.displayName;
   }
}
