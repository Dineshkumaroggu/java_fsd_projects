import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';


@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  constructor(public router:Router) { }

  ngOnInit(): void {
  }

  isAdmin(){
    if(sessionStorage.getItem("userDetails")=="admin")
      return true;
  }

  isUser(){

    if(sessionStorage.getItem("userDetails")=="user")
       return true;

  }

  
  isLoggedIn(){
      if(sessionStorage.getItem("userDetails"))
          return true; 
      else
         return false;
  }


  logout() {
    sessionStorage.removeItem("userDetails");
    this.router.navigate(["home"]);
  }

}
