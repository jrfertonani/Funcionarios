import { Component, OnInit } from '@angular/core';
import { EmployeesFormComponent } from "../employees-form/employees-form.component";
import { EmployeesService } from '../../../services/employees.service';
import { Employees } from '../../../model/Employees';
import { Router } from '@angular/router';

@Component({
  selector: 'app-employees-create',
   standalone: true,
  imports: [EmployeesFormComponent],
  templateUrl: './employees-create.component.html',
  styleUrl: './employees-create.component.css'
})

export class EmployeesCreateComponent {

  btnAcao = "Create";

  descTitulo = "Register employees "

  constructor(private serviceEmployer: EmployeesService, private router: Router){}





createEmployees(employees: Employees){
  this.serviceEmployer.registerEmployees(employees).subscribe(employees => {
      this.router.navigate(['/employees'])
  })
}

}
