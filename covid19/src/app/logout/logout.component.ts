import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthenticationService } from '../service/authentication.service';

@Component({
  selector: 'app-logout',
  templateUrl: './logout.component.html',
  styleUrls: ['./logout.component.scss']
})
export class LogoutComponent implements OnInit {

  constructor(private _router : Router,private _session : AuthenticationService) { }

  ngOnInit(): void {
    this._session.logOut();
    this._router.navigate(['mainhome']);
  }

}
