import { Component, OnInit, Output } from '@angular/core';
import {CalendarModule} from 'primeng/primeng';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-today',
  templateUrl: './today.component.html',
  styleUrls: ['./today.component.css']
})
export class TodayComponent implements OnInit {

  // Current Date
  today: Observable<Date> = Observable.interval(1000).map(x => new Date());
  constructor() { }

  ngOnInit() {
  }

}
