import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Employee } from 'src/app/model/employee';
import {EmployeeService} from 'src/app/services/employee.service'

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {
  employees: Employee[];


  constructor(private employeeService: EmployeeService,
    private router: Router) { }

  ngOnInit(): void {
    this.listEmployees();
  }
  listEmployees(){
  this.employeeService.getEmployees().subscribe(
    data => this.employees = data
  )
}
deleteEmployee(id : number){
  this.employeeService.deleteEmployee(id).subscribe(
    data => {
      console.log(data);
      this.listEmployees();
    }
  )
  
}

employeeDetails(id: number){
this.router.navigate(['details',id]);
}

}
