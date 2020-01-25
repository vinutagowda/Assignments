import { Component } from '@angular/core';
import { summaryFileName } from '@angular/compiler/src/aot/util';
import { getUrlScheme } from '@angular/compiler';
import { getCurrencySymbol } from '@angular/common';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  private firstNumber: number = null;
  private secondNumber: number = null;
  private result: number = null;

  constructor() {
    this.firstNumber = this.firstNumber;
    this.secondNumber = this.secondNumber
  }

  public add(): number {
    this.result = this.firstNumber + this.secondNumber;
    return this.result;
  }
  public sub(): number {
    this.result = this.firstNumber - this.secondNumber;
    return this.result;
  }
  public mul(): number {
    this.result = this.firstNumber * this.secondNumber;
    return this.result;
  }
  public div(): number {
    this.result = this.firstNumber / this.secondNumber;
    return this.result;
  }
}