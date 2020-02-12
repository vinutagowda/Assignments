import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HelloComponent } from './hello/hello.component';
import { FormsModule } from '@angular/forms';
import { PipesDemoComponent } from './pipes-demo/pipes-demo.component';
import { VerbalPipe } from './pipes/verbal.pipe';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HelloComponent,
    PipesDemoComponent,
    VerbalPipe
  ],
  imports: [
    BrowserModule,FormsModule
  
  
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
