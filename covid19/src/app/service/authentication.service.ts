import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AuthenticationService {

  constructor() { }

  sessionName="";
 
  isAdminCase() {
    if (sessionStorage.getItem('username') === "10673136" && sessionStorage.getItem('password') === "123") { 
      let sessionOkay = sessionStorage.getItem('username')
      // console.log(!(sessionOkay === null))
      return !(sessionOkay === null);
    } 
 }
  
  isUserLoggedIn() {
    let sessionOkay = sessionStorage.getItem('username')
     this.sessionName = sessionStorage.getItem('username');
    // console.log(!(sessionOkay === null))
     return !(sessionOkay === null);
  }

  logOut() {
    sessionStorage.removeItem('username')
  }
}
