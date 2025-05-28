import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { NavComponent } from './pages/template/nav/nav.component';
import { FooterComponent } from './pages/template/footer/footer.component';
import { HomeComponent } from './pages/home/home.component';

@Component({
  selector: 'app-root',
  imports: [
    RouterOutlet,
    NavComponent,
    FooterComponent,
    HomeComponent
  ],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'front';
}
