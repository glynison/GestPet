import { Component, OnInit } from '@angular/core';
import { Routes } from '@angular/router';
import { LoginComponent } from '../login/login.component';


const App_ROUTES: Routes = [
  { path: 'loguin', component: LoginComponent},
]

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor() { }
 

  ngOnInit(): void {
  }

}
