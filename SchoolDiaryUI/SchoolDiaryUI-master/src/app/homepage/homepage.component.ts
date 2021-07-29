import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UserQuery, HttpClientServiceService } from '../http-client-service.service';

@Component({
  selector: 'app-homepage',
  templateUrl: './homepage.component.html',
  styleUrls: ['./homepage.component.css']
})
export class HomepageComponent implements OnInit {

  cm: UserQuery = new UserQuery();

  constructor(private router: Router, private http: HttpClientServiceService) { }

  ngOnInit(): void {

    if (sessionStorage.getItem('id')) {
      this.router.navigate(['userHome']);
    }

  }


  submit() {
    this.http.sendQuery(this.cm).subscribe(res => {
      if (res != null) {
        alert("You Will be hearing soon from us");
      }
    })

  }
  singUp() {

    this.router.navigate['register'];

  }


}
