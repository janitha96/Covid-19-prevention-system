import { CurrentlocationService } from "../service/currentlocation.service";

export class Users {
    name:string;
    age:number;
    nic:string;
    email:string;
    tel1:number;
    tel2:number;
    address:string;
    profession:string;
    affiliation:string;
    status:string;
    password:string;
    lat=this._location.latitude;
    lon=this._location.logitude;
    constructor(public _location : CurrentlocationService){

    }

     
    

    // constructor(fname: string,age:number,nid:string, email:string,tel1:number,tel2:number,address:string,pro:string,aff:string,status:string){
    //     this.fname=fname;
    //     this.age=age;
    //     this.nid=nid;
    //     this.status=status;
    //     this.email=email;
    //     this.tel1=tel1;
    //     this.tel2=tel2;
    //     this.address=address;
    //     this.pro=pro;
    //     this.aff=aff;
    // }


    
}
