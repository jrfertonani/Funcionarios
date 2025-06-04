import { Component, Input, OnInit } from '@angular/core';
import { FormGroup, FormsModule, ReactiveFormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { Employees } from '../../../model/Employees';

@Component({
  selector: 'app-employees-form',
  imports: [RouterModule, FormsModule, ReactiveFormsModule],
  templateUrl: './employees-form.component.html',
  styleUrl: './employees-form.component.css'
})
export class EmployeesFormComponent implements OnInit{

  @Input() dataEmployees : Employees | null = null;

  employeesForm! : FormGroup;

  ngOnInit(): void {

    this.employeesForm = new FormGroup({
      id: new FormGroup(this.dataEmployees? this.dataEmployees.id : 0 ),
      email: new FormGroup(this.dataEmployees? this.dataEmployees.email : ""),
      status: new FormGroup(this.dataEmployees?this.dataEmployees.status : "")
    })
   }





}
