/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andile.employeemanagement.model;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author Andile
 */
@Entity
@Table(name="employee")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id",nullable=false)
    private Long id;
    
    @Column(name="First_Name",nullable=false)
    private String firstName;
    
    @Column(name="Last_Name",nullable=false)
    private String lastName;
    
    @Column(name="EmpNo",nullable=false)
    private String employeeNumber;
   
    @OneToMany(cascade=CascadeType.ALL)
    private Set<Address> addresses;
    
   @OneToMany(cascade=CascadeType.ALL)
    private Set<Contact> contacts;
    
    @OneToMany(cascade=CascadeType.ALL)
    private Set<Account> accounts;
    
}
