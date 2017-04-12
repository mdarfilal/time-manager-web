import { Component, OnInit, Output } from '@angular/core';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-today',
  templateUrl: './today.component.html',
  styleUrls: ['./today.component.css']
})
export class TodayComponent implements OnInit {

  // Current Date
  today: Observable<Date> = Observable.interval(100).map(x => new Date());
  constructor() { }

  ngOnInit() {
  }

}
