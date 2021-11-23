import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { Employee } from 'src/app/model/employee';
import {EmployeeService} from 'src/app/services/employee.service'

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {
  employees: Observable<Employee[]>;


  constructor(private employeeService: EmployeeService,private router:Router) { }

  ngOnInit(): void {
    this.listEmployees();
  }
  listEmployees(){
  this.employees = this.employeeService.getEmployees();
  
}
deleteEmployee(id : number){
  this.employeeService.deleteEmployee(id).subscribe(
    data => {
      console.log(data);
      this.listEmployees();
    },
    error => console.log(error)
  );
  
}



}
