import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { NgQrScannerModule } from 'angular2-qrscanner';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './signup/signup.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AdminComponent } from './admin/admin.component';
import { ProfilesComponent } from './profiles/profiles.component';
import { StatusComponent } from './status/status.component';
import { ContactsComponent } from './contacts/contacts.component';
import { LogoutComponent } from './logout/logout.component';
import { DeleteuserComponent } from './deleteuser/deleteuser.component';
import { MainhomeComponent } from './mainhome/mainhome.component';
import { ScanComponent } from './scan/scan.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    LoginComponent,
    SignupComponent,
    AdminComponent,
    ProfilesComponent,
    StatusComponent,
    ContactsComponent,
    LogoutComponent,
    DeleteuserComponent,
    MainhomeComponent,
    ScanComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    NgQrScannerModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
