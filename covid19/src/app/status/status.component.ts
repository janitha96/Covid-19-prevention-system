import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Statusupdate } from '../model/statusupdate';
import { ServiceService } from '../service/service.service';

@Component({
  selector: 'app-status',
  templateUrl: './status.component.html',
  styleUrls: ['./status.component.scss']
})
export class StatusComponent implements OnInit {
nid:String;
searchStatusById=null;
msg="";
status = new Statusupdate();
  constructor(private _service : ServiceService,private _router : Router) { }

  ngOnInit(): void {
    this.searchStatusByIdentity();
  }

  searchStatusByIdentity(){
    this._service.getUserSeach(this.nid).subscribe(
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

  updateStatusByIdentity(){
    this._service.updateHealthStatus(this.nid,this.status).subscribe(
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
