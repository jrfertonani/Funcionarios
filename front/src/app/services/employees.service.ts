import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class EmployeesService {


  URL = 'http://localhost:8080/employees';

  constructor(private http: HttpClient) { }

}
