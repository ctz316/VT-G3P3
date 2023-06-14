import { Component } from '@angular/core';
import { UserService } from 'src/services/user.service';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent {

constructor(private uServ: UserService) { this.getAllUsers(); }

getAllUsers(): void {
  this.uServ.getAllUsers().subscribe(data => {
    console.log(data.body)
  });
}

}
