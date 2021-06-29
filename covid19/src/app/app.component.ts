import { Component } from '@angular/core';
import { AuthenticationService } from './service/authentication.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'covid19';
  constructor(public _session : AuthenticationService){

  }

  logName="";
  ngOnInit(): void {
    this.logName = this._session.sessionName;
    console.log("hello"+this.logName);
  }
}
