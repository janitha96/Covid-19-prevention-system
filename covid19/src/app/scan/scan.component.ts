import { Component, OnInit, ViewChild, ViewEncapsulation } from '@angular/core';
import { Router } from '@angular/router';
import {QrScannerComponent} from 'angular2-qrscanner';
import { Users } from '../model/users';
import { Userupdatelocation } from '../model/userupdatelocation';
import { AuthenticationService } from '../service/authentication.service';
import { CurrentlocationService } from '../service/currentlocation.service';
import { ServiceService } from '../service/service.service';

@Component({
  selector: 'app-scan',
  templateUrl: './scan.component.html',
  styleUrls: ['./scan.component.scss']
})
export class ScanComponent implements OnInit {

  msg='';
  logNid="";
  lat;
  lg;
  userLocation = new Userupdatelocation(this._location,this.loginService);
    constructor(private _service : ServiceService,public _location : CurrentlocationService,public loginService : AuthenticationService,private _router :Router) { }
  
    // ngOnInit(): void {
    // }
    @ViewChild(QrScannerComponent,{ static : false }) qrScannerComponent: QrScannerComponent ;
    ngOnInit(): void {
      
  }
   ngAfterViewInit(): void {
    //   this.registerUser();
  
  this.logNid=this.loginService.sessionName
     this._location.getLatitude();
     this._location.getLongitue();
    this.qrScannerComponent.getMediaDevices().then(devices => {
      console.log(devices);
      
      const videoDevices: MediaDeviceInfo[] = [];
      for (const device of devices) {
          if (device.kind.toString() === 'videoinput') {
              videoDevices.push(device);
          } 
      }
      if (videoDevices.length > 0){
          let choosenDev;
          for (const dev of videoDevices){
              if (dev.label.includes('front')){
                  choosenDev = dev;
                  break;
              }
          }
          if (choosenDev) {
              this.qrScannerComponent.chooseCamera.next(choosenDev);
          } else {
              this.qrScannerComponent.chooseCamera.next(videoDevices[0]);
          }
      }
  });
  
  this.qrScannerComponent.capturedQr.subscribe(result => {
     
        this.registerUser();
      console.log(result);
      this.lat= console.log(this._location.latitude);
      this.lg= console.log(this._location.logitude);
  //    this.lg= console.log("wwwe"+this._location.getCurrentLocation().then(resp=>{resp.logitute}));
  });
  
  
   }
  
   registerUser(){
      this._service.userCurrentLocation(this.userLocation).subscribe(
        data => {console.log("okay")
        // this._router.navigate(['/home'])
      },
        error =>{ 
          console.log("error occur") 
          this.msg=error.error;
          ;
        }
      )
    }
  

}
