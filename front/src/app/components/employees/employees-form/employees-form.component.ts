import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
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

  @Input() btnAcao!: string;

  @Input() descTitulo!: string;

  @Output() onSubmit = new EventEmitter<Employees>();

  @Input() dataEmployees : Employees | null = null;

  employeesForm! : FormGroup;

  ngOnInit(): void {
    this.employeesForm = new FormGroup({
      id: new FormGroup(this.dataEmployees ? this.dataEmployees.id : 0 ),
      name: new FormGroup(this.dataEmployees ? this.dataEmployees.name : ""),
      email: new FormGroup(this.dataEmployees ? this.dataEmployees.email : ""),
      status: new FormGroup(this.dataEmployees ? this.dataEmployees.status : "")
    })
   }



   submit(){
    this.onSubmit.emit(this.employeesForm.value);
   }



}
