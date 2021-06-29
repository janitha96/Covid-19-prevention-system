import { HomeComponent } from "../home/home.component";
import { AuthenticationService } from "../service/authentication.service";
import { CurrentlocationService } from "../service/currentlocation.service";
import { Component, OnInit, ViewChild, ViewEncapsulation } from '@angular/core';

export class Userupdatelocation  {
    user= new CurrentlocationService();
    nid:String=this.logUser.sessionName;
    lat=this.location.latitude;
    lon=this.location.logitude;

    constructor(public location : CurrentlocationService, public logUser : AuthenticationService){
        
    }

   
}
