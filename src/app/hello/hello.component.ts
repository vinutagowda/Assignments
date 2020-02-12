import { Component } from '@angular/core';

@Component({
  selector: 'app-hello',
  templateUrl: './hello.component.html',
  styleUrls: ['./hello.component.css']
})
export class HelloComponent  {
  userName:string;

  constructor() {
    this.userName="Somebody";
   }
greet=()=>{
  alert(`Hello!$(this.userName) good to see you all`);
}
 
}
