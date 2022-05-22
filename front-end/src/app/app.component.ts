import { Component } from '@angular/core';
import { Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';

const App_ROUTES: Routes = [
  { path: 'loguin', component: LoginComponent},
]

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],


  
  
})
export class AppComponent {
  title = 'Projeto_IntegradorADS5';
}
