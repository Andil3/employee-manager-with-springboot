/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andile.employeemanagement.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Andile
 */
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id",nullable=false)
    private Long id;
    
    @Column(name="First_Name",nullable=false)
    private String firstName;
    
    @Column(name="Last_Name",nullable=false)
    private String lastName;
    
    @Column(name="EmpNo",nullable=false)
    private String employeeNumber;
    
    
    @Column(name="Address_List",nullable=false)
    @OneToMany(cascade= CascadeType.ALL,orphanRemoval=true)
    private List<Address> addresses;
    
    
    @Column(name="Contact_Details",nullable=false)
    @OneToMany(cascade= CascadeType.ALL,orphanRemoval=true)
    private List<Contact> contacts;
    
}
