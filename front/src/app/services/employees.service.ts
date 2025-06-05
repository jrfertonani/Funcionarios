import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Employees } from '../model/Employees';


@Injectable({
  providedIn: 'root'
})
export class EmployeesService {


  URL = 'http://localhost:8080/employees';

  constructor(private http: HttpClient) { }


  getEmployees(): Observable<Employees[]>{
    return this.http.get<Employees[]>(this.URL);
  }

  registerEmployees(employee: Employees): Observable<Employees>{
    return this.http.post<Employees>(this.URL,employee);
  }


}
