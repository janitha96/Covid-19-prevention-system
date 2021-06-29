import { Component, OnInit } from '@angular/core';
import {NgForm} from '@angular/forms';
import { Router } from '@angular/router';
import { Users } from '../model/users';
import { CurrentlocationService } from '../service/currentlocation.service';
import { ServiceService } from '../service/service.service';
@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.scss']
})
export class SignupComponent implements OnInit {
 users = new Users(this._location);
 msg='';
//  latitude: void;
//  logitude: void;
  constructor(private _service : ServiceService, private _router : Router,public _location : CurrentlocationService) { }

  ngOnInit(): void {
    this._location.getLatitude();
    this._location.getLongitue();
  }

  // getLocation(){
  //   this._location.getCurrentLocation().then(resp=>{
  //     this.latitude=console.log(resp.latt);
  //     this.logitude=console.log(resp.lng);
      
  //   })
  // }

  registerUser(){
    this._service.signupUser(this.users).subscribe(
      data => {console.log("okay")
      this._router.navigate(['/login'])
    },
      error =>{ 
        console.log("error occur") 
        this.msg=error.error;
        ;
      }
    )
  }

}
