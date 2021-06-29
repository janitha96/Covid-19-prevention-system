import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Users } from '../model/users';
import { Observable } from 'rxjs';
import { Loguser } from '../model/loguser';
import { Statusupdate } from '../model/statusupdate';
import { Userupdatelocation } from '../model/userupdatelocation';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  constructor(private _http : HttpClient) { }

  public signupUser (user :Users):Observable<any>{
    return this._http.post<any>("http://localhost:8080/covidApp/webapi/citizens",user);
}

public loginUser (logger :Loguser):Observable<any>{
  return this._http.post<any>("http://localhost:8080/covidApp/webapi/citizens/login",logger);
}

public getSignupDetailsForAdmin ():Observable<any>{
  return this._http.get<any>("http://localhost:8080/covidApp/webapi/citizensDetails/nid")
}

public getUserSeach (nid : String):Observable<any>{
  return this._http.get<any>("http://localhost:8080/covidApp/webapi/citizensDetails/nid/"+nid)
}
public updateHealthStatus (nid : String, status : Statusupdate):Observable<any>{
  return this._http.put<any>("http://localhost:8080/covidApp/webapi/citizenStatus/"+nid,status);
}

public getUserSeachForDelete (nid : String):Observable<any>{
  return this._http.get<any>("http://localhost:8080/covidApp/webapi/citizenDelete/"+nid)
}

public deleteUserById (nid : String):Observable<any>{
  return this._http.delete<any>("http://localhost:8080/covidApp/webapi/citizenDelete/"+nid);
}

public getUserSeachForContacts (tel : String):Observable<any>{
  return this._http.get<any>("http://localhost:8080/covidApp/webapi/citizensDetails/nid/contact/"+tel)
}
public userCurrentLocation (userLoc : Userupdatelocation):Observable<any>{
  return this._http.put<any>("http://localhost:8080/covidApp/webapi/citizensLocations/nid",userLoc)
}
}
