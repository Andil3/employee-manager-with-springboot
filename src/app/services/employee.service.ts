import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import { Employee } from '../model/employee';
import { environment } from "src/environments/environment";
@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  private apiServerUrl = environment.apiBaseUrl;
  constructor(private http: HttpClient){}

  public getEmployee(id:number):Observable<Employee>{
      return this.http.get<Employee>(`${this.apiServerUrl}`);
  }

  public getEmployees(): Observable<Employee[]>{
      return this.http.get<Employee[]>(`${this.apiServerUrl}/employee/find`);

  }
  public addEmployee(employee: Employee): Observable<Employee>{
      return this.http.post<Employee>(`${this.apiServerUrl}/employee/add`,employee);
  }


  public updateEmployee(employeeId: number,employee: Employee): Observable<Employee>{
      return this.http.put<Employee>(`${this.apiServerUrl}/employee/update${employeeId}`,employee);
  }

  public deleteEmployee(employeeId: number): Observable<Employee>{
      return this.http.delete<Employee>(`${this.apiServerUrl}/employee/delete/${employeeId}`);
  }
  }


