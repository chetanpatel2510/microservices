import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpModule } from '@angular/http';
import { FormsModule } from '@angular/forms';

import { HttpService } from '../services/HttpService.service';


import { LoginComponent } from './login.component';


@NgModule({
  declarations: [
    // All components are added here.  
    LoginComponent
  ],
  imports: [
    // All Module Imports are added here.  
    BrowserModule, 
    HttpModule, // This module is required to call Http API
    FormsModule
  ],
  providers: [
    // All Services are added here
    HttpService
  ],
  // Do not keep bootstrap component as there can be only one bootstrap component.
})
export class LoginModule { }
