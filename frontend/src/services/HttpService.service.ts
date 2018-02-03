import { Injectable } from '@angular/core';
import { HttpModule, Http, Response, Headers, RequestOptions } from '@angular/http';
import { Observable } from 'rxjs/Rx';

import { BaseEntity } from 'models/BaseEntity';
import { HttpConstants } from 'util/HttpConstants';

import 'rxjs/add/operator/map';

@Injectable()
export class HttpService {
    constructor(private http: Http) {

    }

    /**
     * This method will call back end Http API.
     * @param inputObject input object.
     * @param uri uri to be called.
     * @param httpMethodType http method type GET/POST/PUT etc.
     */
    public callHttpService(inputObject: BaseEntity, uri: string, httpMethodType: string) {
        var targetHost = "http://localhost:8081";
        var url = targetHost + uri;

        var headers = new Headers();
        headers.append('Content-Type', 'application/json');
        headers.append('Access-Control-Allow-Headers', 'Content-Type');
        headers.append('Access-Control-Allow-Origin', '*');
        headers.append('Accept', 'application/json;charset=UTF-8');
        headers.append('Access-Control-Request-Method', 'POST');

        if (httpMethodType === HttpConstants.HTTP_METHOD_GET) {
            this.http.get(url).subscribe(res => { console.log(res) });
        } else if (httpMethodType === HttpConstants.HTTP_METHOD_POST) {
            this.http.post(url, inputObject).subscribe(res => { console.log(res) });
        }

        //map((response : Response) => response.json()).
    }

    /**
     * This method will call Get Service.
     * @param uri 
     */
    public get(uri: string) : Observable<any> {
        var url = HttpConstants.TARGET_HOST + uri;
        var headers = new Headers();
        console.log("Token From Local Storage during call: "+localStorage.getItem("access_token"));
        headers.append('Authorization', 'Bearer '+localStorage.getItem("access_token"));
        let options = new RequestOptions({ headers: headers });
        var observable = this.http.get(url, options); 
        return observable;
         
    }

    /**
     * This method will call http post methods.
     * @param uri uri to be called for zuul proxy.
     * @param inputObject input object to be passed in http post. It must be instance of       *                    BaseEntity
     */
    public post(uri: string, inputObject: BaseEntity) : Observable<any> {
        var url = HttpConstants.TARGET_HOST + uri;
        var observable = this.http.post(url, inputObject);
        return observable;
    }

    public getToken() : Observable<any> {

        var url = HttpConstants.TARGET_HOST + "/security-service/auth/oauth/token?username=user&password=user&grant_type=password&scope=read";
        var headers = new Headers();
        var authData = btoa("ClientId:secret");
        headers.append('Authorization', 'Basic '+authData);
        let options = new RequestOptions({ headers: headers });
        var observable = this.http.post(url,null,options);
        return observable;
    }

    public getValues(key:string, value:string) {
        console.log(key);
        return value;
    }

}