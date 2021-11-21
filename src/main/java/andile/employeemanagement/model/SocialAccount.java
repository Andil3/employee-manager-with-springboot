/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andile.employeemanagement.model;
import andile.employeemanagement.Enum.SocialMediaType;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Andile
 */
@Entity(name="Social_Accounts")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class SocialAccount implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id",nullable=false)
    private Long id;
    
    @Column(name="socialMediaURL",nullable=false)
    private String socialMediaURL;
    
    
    @Column(name="SocialMediaType",nullable=false)
    @Enumerated(EnumType.STRING)
     private SocialMediaType type;
}
