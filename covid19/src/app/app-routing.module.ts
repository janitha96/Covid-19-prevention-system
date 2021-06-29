import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {HeaderComponent} from './header/header.component';
import {HomeComponent} from './home/home.component';
import {LoginComponent} from './login/login.component';
import {SignupComponent} from './signup/signup.component';
import {AdminComponent} from './admin/admin.component';
import {ProfilesComponent} from './profiles/profiles.component';
import {StatusComponent} from './status/status.component';
import {ContactsComponent} from './contacts/contacts.component';
import {LogoutComponent} from './logout/logout.component';
import {DeleteuserComponent} from './deleteuser/deleteuser.component';
import {MainhomeComponent} from './mainhome/mainhome.component';
import {ScanComponent} from './scan/scan.component';


const routes: Routes = [

  {path: 'home', component:HomeComponent},
  {path: 'login', component:LoginComponent},
  {path: 'signup', component:SignupComponent},
  {path: 'admin', component:AdminComponent},
  {path: 'profiles', component:ProfilesComponent},
  {path: 'status', component:StatusComponent},
  {path: 'contacts', component:ContactsComponent},
  {path: 'logout', component:LogoutComponent},
  {path: 'deleteuser', component:DeleteuserComponent},
  {path: '', component:MainhomeComponent},
  {path: 'scan', component:ScanComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
