import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { ProductService } from '../product.service';
import { UserClass } from '../UserClass';

@Component({
  selector: 'app-editusers',
  templateUrl: './editusers.component.html',
  styleUrls: ['./editusers.component.css']
})
export class EditusersComponent implements OnInit {

 
  allusers:Observable<UserClass[]>;

  constructor(private router:Router, private service:ProductService) { }

  users:UserClass[];


  ngOnInit(): void {
    this.getusers();
  }

  getusers(){
    this.service.getAllUser().subscribe(result=>this.users=result);
  }

  BookDelete(id:number){
    this.service.deletePost(id);
    console.log("user deleted");  
    this.onReload();
}

onReload(){
  this.router.navigate(['/approve']);
  this.ngOnInit(); 
}



}
