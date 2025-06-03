import { Routes } from '@angular/router';
import { HomeComponent } from './pages/home/home.component';
import { EmployeesListComponent } from './components/employees/employees-list/employees-list.component';
import { EmployeesCreateComponent } from './components/employees/employees-create/employees-create.component';
import { EmployeesUpdateComponent } from './components/employees/employees-update/employees-update.component';

export const routes: Routes = [

{path:'', component: HomeComponent},
{path:'employees',component: EmployeesListComponent},
{path:'employees/create',component: EmployeesCreateComponent},
{path:'employees/update/:id',component: EmployeesUpdateComponent},

];
