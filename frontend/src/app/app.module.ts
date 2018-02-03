/**
 * As a standard practice, group imports by angular modules, custom modules, services,         *  components.
 */
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpModule } from '@angular/http';
import { RouterModule, Routes, Router } from '@angular/router';
import { FormsModule } from '@angular/forms';

import { HttpService } from 'services/HttpService.service';

import { LoginComponent } from 'login/login.component';
import { AppComponent } from './app.component';

const appRoutes: Routes = [
    { path: 'loginPage', component: LoginComponent }
];
@NgModule({
    declarations: [
        // All components are added here.  
        AppComponent,
        LoginComponent
    ],
    imports: [
        // All Module Imports are added here.  
        BrowserModule,
        HttpModule, // This module is required to call Http API
        RouterModule.forRoot(appRoutes),
        FormsModule
    ],
    providers: [
        // All Services are added here
        HttpService
    ],
    bootstrap: [
        // This is bootstrap component.
        AppComponent
    ]
})
export class AppModule { }
