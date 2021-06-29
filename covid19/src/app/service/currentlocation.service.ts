import { Injectable } from '@angular/core';


@Injectable({
  providedIn: 'root'
})
export class CurrentlocationService {
  
  latitude;
  

  constructor() { 
  
  }



  getCurrentLocation():Promise<any>{
    return new Promise((resolve , reject)=>{
      navigator.geolocation.getCurrentPosition(resp=>{
        resolve({lng : resp.coords.longitude , latt : resp.coords.latitude})
      
    //  this.latitude=  console.log("lat"+resp.coords.latitude);
      //  console.log("lon"+resp.coords.longitude);
      //  console.log(this.logitude);
      })
    })
  }


  getLocation(){
     this.getCurrentLocation().then(resp=>{
      // console.log("lon"+resp.coords.longitude);
      // this.latitude=resp.latt;
     
      
    })
  }

  getLatitude():Promise<any>{
    return new Promise((resolve , reject)=>{
      navigator.geolocation.getCurrentPosition(resp=>{
        resolve({latt : resp.coords.latitude})
        resp.coords.latitude;
      
     this.latitude= resp.coords.latitude;

      })
    })
  }
  logitude;
  getLongitue():Promise<any>{
    
    return new Promise((resolve , reject)=>{
      navigator.geolocation.getCurrentPosition(
        resp=>{
         
          
                 this.logitude= resp.coords.longitude;

      })
    })
  }

}
