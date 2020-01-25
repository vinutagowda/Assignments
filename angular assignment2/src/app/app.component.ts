import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  private  message :string= null;
  private  version :number =null;
  private  topics :string[] =null;
  private index:number=null;
  public constructor(){
    this.message="welcome";
    this.version=8;
    this.topics=['data binding','forms','http','routing'];
  }
  public addTopic(currentTopic:string):boolean{
    if(currentTopic==""){
      alert("add topic");
      return false;
    }
    for(var topic of this.topics )
    {
      if(currentTopic==topic)
      alert("Duplicate topic");
    }

    this.topics.push(currentTopic);
  }
    
  
  public deleteTopic(idx:number):void{
     this.topics.splice(idx,1);
}
public search(currentTopics:string):void{
  if(currentTopics==""){
    alert("no such topics")
  }
     for(var topic of this.topics)
     if(currentTopics==topic)
     alert(topic);

      
  }
  public delete(currentTopic:string):void{
    if(currentTopic=="")
    alert("no topics to delete");
    for(var topic of this.topics)
    if(currentTopic==topic){

    
    this.index=this.topics.indexOf(currentTopic);
    this.topics.splice(this.index,1);
    }
  
  } 
}


