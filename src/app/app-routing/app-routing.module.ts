import { NgModule } from '@angular/core';

import {  RouterModule, Routes } from '@angular/router';
import { CreateEmployeeComponent } from '../components/create-employee/create-employee.component';
import { EmployeeListComponent } from '../components/employee-list/employee-list.component';





const routes: Routes = [
  {path :'',redirectTo:'employee',pathMatch:'full'},
  {path:'add',component: CreateEmployeeComponent},
  {path: 'employees',component: EmployeeListComponent}
]

@NgModule({
  declarations: [],
  imports: [
    RouterModule.forRoot(routes)
  ],
  exports:[RouterModule]
})
export class AppRoutingModule { }
