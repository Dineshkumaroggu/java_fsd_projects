import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-userdashboard',
  templateUrl: './userdashboard.component.html',
  styleUrls: ['./userdashboard.component.css']
})
export class UserdashboardComponent implements OnInit {

 
  constructor(public router:Router,private service:ProductService) { }

  ngOnInit(): void {

  }

  user = {
    name: '',
    dob:'',
    address:'',
    email: '',
    mobile:'',
    gender:'',
  };


  isBookAdded = false;

  // Add New
  addUser(): void {

    const data = {
      name: this.user.name,
      dob: this.user.dob,
      address: this.user.address,
      email: this.user.email,
      mobile: this.user.mobile,
      gender:this.user.gender,
    };
    if (!data.name) {
      alert('Please add title!');
      return;
    }

    this.service.create(data)
      .subscribe(
        response => {
          console.log(response);
          this.isBookAdded = true;
          
        },
        error => {
          console.log(error);
        });
  }


}
