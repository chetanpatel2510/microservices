import { Component } from '@angular/core';

import { HttpService } from 'services/HttpService.service';

import { User } from 'models/User';
import { HttpConstants } from 'util/HttpConstants';

@Component({
    selector: 'login-root',
    templateUrl: './login.component.html',
    styleUrls: ['./login.component.css']
})
export class LoginComponent {
    title = 'Login';

    user: User = new User();

    /**
     * Constructor with http service injected.
     * @param httpService httpService injected.
     */
    constructor(private httpService: HttpService) {
        this.httpService = httpService;
    }
    /**
     * Call this method on click of the submit button on login page.
     */
    public submitLoginForm() {
        console.log(this.user);
        console.log("Submitting Login Form");
        var observable = this.httpService.getToken();
        observable.subscribe(
            res=> {
                localStorage.setItem("access_token",JSON.parse(JSON.parse(JSON.stringify(res))._body).access_token);
                console.log("Token From Local Storage Before call: "+localStorage.getItem("access_token"));

                var observable1 = this.httpService.get("/product-service/getProductById/1");
                observable1.subscribe(
                    // Lambda function to handle HTTP Success
                    res1 => {
                        console.log(res1);
                        //TODO - Handle the response and parse it.
                    },
                    // Lambda function to handle HTTP Error.
                    err => {
                        console.log(err);
                        if (err.status == 401) {
                            console.log("Error code 401 found");
                        }
                    }
                );
            }
        );
        
    }

}
