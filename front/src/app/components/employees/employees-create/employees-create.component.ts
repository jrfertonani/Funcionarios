import { Component } from '@angular/core';
import { EmployeesFormComponent } from "../employees-form/employees-form.component";

@Component({
  selector: 'app-employees-create',
  imports: [EmployeesFormComponent],
  templateUrl: './employees-create.component.html',
  styleUrl: './employees-create.component.css'
})
export class EmployeesCreateComponent {

}
