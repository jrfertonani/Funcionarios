import { Component, OnInit } from '@angular/core';
import { RouterModule } from '@angular/router';
import { EmployeesService } from '../../../services/employees.service';
import { Employees } from '../../../model/Employees';

@Component({
  selector: 'app-employees-list',
  imports: [RouterModule],
  templateUrl: './employees-list.component.html',
  styleUrl: './employees-list.component.css'
})
export class EmployeesListComponent implements OnInit {

  employees : Employees [] = [];


  ngOnInit(): void {

    this.employeesService.getEmployees().subscribe(employees => {
      this.employees = employees;

    })

  }


  constructor(private employeesService: EmployeesService){}

}
