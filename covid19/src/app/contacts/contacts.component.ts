import { Component, OnInit } from '@angular/core';
import { ServiceService } from '../service/service.service';

@Component({
  selector: 'app-contacts',
  templateUrl: './contacts.component.html',
  styleUrls: ['./contacts.component.scss']
})
export class ContactsComponent implements OnInit {
  tel:String;
  searchStatusById=null;
  msg="";
  constructor(private _service : ServiceService) { }

  ngOnInit(): void {
    this.searchByContacts();
  }
  searchByContacts(){
    this._service.getUserSeachForContacts(this.tel).subscribe(
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

}
