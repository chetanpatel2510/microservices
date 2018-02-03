import { Component } from '@angular/core';
import { Router } from '@angular/router';

import { HttpService } from 'services/HttpService.service';

@Component({
    selector: 'app-root',
    templateUrl: './app.component.html',
    styleUrls: ['./app.component.css']
})
export class AppComponent {
    title = 'app';


    /**
     * Constructor with router and httpService injected.
     * @param router router to route and navigate pages.
     * @param httpService httpService call backend Http APIs.
     */
    constructor(private router: Router, private httpService: HttpService) {

    }
    /**
     * Call this method on click of the login link
     */
    public startLogin() {
        var observable = this.httpService.get("/product-service/getProductById/1")
        observable.subscribe(
            // Lambda function to handle HTTP Success
            res => {
                console.log(res);
                //TODO - Handle the response and parse it.
            },
            // Lambda function to handle HTTP Error.
            err => {
                if (err.status == 401) {
                    console.log("Error code 401 found");
                    this.router.navigate(['/loginPage']);
                }
            }
        );


    }

    /**
     * This method is called when user clicks on login link.
     */
    loginClick = function () {
        console.log("Calling login page");
        this.router.navigate(['/loginPage']);
    };

}
