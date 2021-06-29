import { Component, OnInit } from '@angular/core';
import { ServiceService } from '../service/service.service';

@Component({
  selector: 'app-profiles',
  templateUrl: './profiles.component.html',
  styleUrls: ['./profiles.component.scss']
})
export class ProfilesComponent implements OnInit {

  signupDetails=null;
  searchByNid=null;
  msg="";
  nid:String;
  constructor(private _service : ServiceService) { }

  ngOnInit(): void {
    this.getSignupDetails();
    this.searchIdentity();
  }

  getSignupDetails(){
    this._service.getSignupDetailsForAdmin().subscribe(
      data => {console.log(data)
      // this._router.navigate(['/login'])
      this.signupDetails = data;
    },
      error =>{ 
        console.log("error occur") 
        this.msg=error.error;
        ;
      }
    )
  }

  searchIdentity(){
    this._service.getUserSeach(this.nid).subscribe(
      data => {console.log("okay")
      this.searchByNid = data;
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
