import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AccountType } from 'src/app/model/accountType';
import { AddressType } from 'src/app/model/addressType';
import { ContactType } from 'src/app/model/contactType';
import { Employee } from 'src/app/model/employee';
import { EmployeeService } from 'src/app/services/employee.service';

@Component({
  selector: 'app-create-employee',
  templateUrl: './create-employee.component.html',
  styleUrls: ['./create-employee.component.css']
})
export class CreateEmployeeComponent implements OnInit {
employee:Employee = new Employee();
submitted = false;
type=AddressType;
accountType=AccountType;
contactType=ContactType;
  constructor(private employeeService: EmployeeService,
    private router: Router) { }

  ngOnInit(): void {
  }

  onSubmit(){
    this.submitted= true;
    this.employeeService.addEmployee(this.employee).subscribe(
      data => console.log(data),error => console.log(error))
      
    this.employee=new Employee();
    this.router.navigate(['/employees'])
  }
}
