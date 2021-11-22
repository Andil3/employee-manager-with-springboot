/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andile.employeemanagement;

import andile.employeemanagement.Enum.AccountType;
import andile.employeemanagement.Enum.AddressType;
import andile.employeemanagement.Enum.ContactType;
import andile.employeemanagement.model.Account;
import andile.employeemanagement.model.Address;
import andile.employeemanagement.model.Contact;
import andile.employeemanagement.model.Employee;
import andile.employeemanagement.repository.EmployeeRepository;
import java.util.Set;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

/**
 *
 * @author Andile
 */
@DataJpaTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EmployeeRepositoryTests {

    @Autowired
    private EmployeeRepository employeeRepository;

    // test for Save/Add Employee
    @Test
    @Order(1)
    @Rollback(value = false)
    public void saveEmployeeTest() {
        Address address = Address.builder()
                .addressLine1("L111 Umlazi Township")
                .addressLine2("Umlazi")
                .addressLine3("Durban")
                .type(AddressType.POSTAL).build();

        Address address1 = Address.builder()
                .addressLine1("Q334 KwaMashu Township")
                .addressLine2("KwaMashu")
                .addressLine3("Durban")
                .type(AddressType.RESIDENTIAL).build();
        Contact contact1 = Contact.builder()
                .contactValue("073366310")
                .contactType(ContactType.MOBILENUMBER)
                .build();
        Contact contact2 = Contact.builder()
                .contactValue("0117144431")
                .contactType(ContactType.LANDLINE)
                .build();
        Contact contact3 = Contact.builder()
                .contactValue("qumbisaanathy@gmail.com")
                .contactType(ContactType.EMAIL)
                .build();

        Account account = Account.builder()
                .socialMediaURL("@Jiyeza1")
                .accountType(AccountType.TWITTER)
                .build();

        Account account2 = Account.builder()
                .socialMediaURL("Andile Griffith Qumbisa")
                .accountType(AccountType.LINKEDIN)
                .build();

        Employee employee = Employee.builder()
                .firstName("Andile")
                .lastName("Qumbisa")
                .employeeNumber("CC200")
                .addresses((Set<Address>) address)
                .addresses((Set<Address>) address1)
                .contacts((Set<Contact>) contact1)
                .contacts((Set<Contact>) contact2)
                .contacts((Set<Contact>) contact3)
                .accounts((Set<Account>) account)
                .accounts((Set<Account>) account2)
                .build();
        employeeRepository.save(employee);
        System.out.println(employee);

    }

    @Test
    @Order(2)
    public void getEmployeeTest() {
        employeeRepository.findById(1L).get();

    }

    @Test
    @Order(3)
    public void getEmployeesTest() {
        employeeRepository.findAll();
    }

    @Test
    @Order(4)
    @Rollback(value = false)
    public void updateEmployee() {
        Employee employee = employeeRepository.findById(1L).get();
        employee.setLastName("Jiyeza");
        System.out.println(employee);
    }

    @Test
    @Order(5)
    @Rollback(value = false)
    public void deleteEmployee() {
        Employee employee = employeeRepository.findById(1L).get();
        employeeRepository.delete(employee);
        System.out.println("employee deleted");
    }
}
