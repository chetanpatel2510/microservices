import { BaseEntity } from 'models/BaseEntity';

export class User extends BaseEntity {

    private username: string;

    private password: string;

    public getUsername() : string {
        return this.username;
    }

    public setusername(username : string) {
        this.username = username;
    }

    public getPassword() : string {
        return this.password;
    }

    public setPassword(password : string) {
        this.password = password;
    }
}