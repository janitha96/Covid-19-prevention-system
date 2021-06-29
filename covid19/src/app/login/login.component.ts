import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Loguser } from '../model/loguser';
import { Users } from '../model/users';
import { AuthenticationService } from '../service/authentication.service';
import { ServiceService } from '../service/service.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {
 user= new Loguser();
 msg='';
  constructor(private _service : ServiceService, private _router : Router, public _session : AuthenticationService) { }

  ngOnInit(): void {
  }

  loginUser(){
    this._service.loginUser(this.user).subscribe(
      data=> {  sessionStorage.setItem('username',this.user.nid)
      sessionStorage.setItem('password', this.user.pwd)
      console.log("okay")
      console.log(this.user.nid)
      this._router.navigate(['/home'])
      // if (this.loginService.authenticate(this.user.uname, this.user.pwd)
      // ) {
       
      //   console.log("okay")
      //   this._router.navigate(['/home'])
      //   this.invalidLogin = false
      // } else
      //   this.invalidLogin = true
     
    },
      error =>{ 
        console.log("error occur"+error) 
        this.msg="Bad Loging";
        
      }
    )
  }

}
