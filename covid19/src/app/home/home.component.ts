import { Component, OnInit, ViewChild, ViewEncapsulation } from '@angular/core';

import { AuthenticationService } from '../service/authentication.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss'],
  encapsulation: ViewEncapsulation.None,
})
export class HomeComponent implements OnInit {

logNid="";
  constructor(public loginService : AuthenticationService) { }


  ngOnInit(): void {
    
}





}
