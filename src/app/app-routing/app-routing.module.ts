import { NgModule } from '@angular/core';

import {  RouterModule, Routes } from '@angular/router';
import { CreateEmployeeComponent } from '../components/create-employee/create-employee.component';





const routes: Routes = [
  {path :'',redirectTo:'employee',pathMatch:'full'},
  {path:'add',component: CreateEmployeeComponent}
]

@NgModule({
  declarations: [],
  imports: [
    RouterModule.forRoot(routes)
  ],
  exports:[RouterModule]
})
export class AppRoutingModule { }
