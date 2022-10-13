import { ProductService } from './../product.service';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { UserClass } from '../UserClass';


@Component({
  selector: 'app-allusers',
  templateUrl: './allusers.component.html',
  styleUrls: ['./allusers.component.css']
})
export class AllusersComponent implements OnInit {


  allusers:Observable<UserClass[]>;

  constructor(private router:Router, private service:ProductService) { }

  users:UserClass[];

  ngOnInit(): void {

    this.getusers();
  }

  getusers(){
    this.service.getAllUser().subscribe(result=>this.users=result);
  }

}
