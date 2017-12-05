import { Injectable } from '@angular/core';
import { HttpModule, Http, Response, Headers } from  '@angular/http';
import { Observable } from 'rxjs/Rx';
import 'rxjs/add/operator/map';

@Injectable()
export class HttpService {
    constructor(private http : Http) {

    }

    /**
     * This method will call backend Http API
     */
    public callHttpService(url : string) {
        this.http.get(url).map((response : Response) => response.json()).subscribe();
    }
}