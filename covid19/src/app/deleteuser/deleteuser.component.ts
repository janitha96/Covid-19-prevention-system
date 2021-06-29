import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ServiceService } from '../service/service.service';

@Component({
  selector: 'app-deleteuser',
  templateUrl: './deleteuser.component.html',
  styleUrls: ['./deleteuser.component.scss']
})
export class DeleteuserComponent implements OnInit {
nid:String;
searchStatusById=null;
msg="";
  constructor(private _service : ServiceService,private _router : Router) { }

  ngOnInit(): void {
  }
  getUserSeachForDelete(){
    this._service.getUserSeachForDelete(this.nid).subscribe(
      data => {console.log("okay")
      this.searchStatusById = data;
      // this._router.navigate(['/home'])
    },
      error =>{ 
        console.log("error occur") 
        this.msg=error.error;
        ;
      }
    )
  }
  deleteUser(){
    this._service.deleteUserById(this.nid).subscribe(
      data => {console.log("okay")
      // this.searchStatusById = data;
       this._router.navigate(['/home'])
    },
      error =>{ 
        console.log("error occur") 
        this.msg=error.error;
        ;
      }
    )
  }

}
