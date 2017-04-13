import { myDays } from './../data/myDays';
import { Day } from './../model/day.model';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-details',
  templateUrl: './details.component.html',
  styleUrls: ['./details.component.css']
})
export class DetailsComponent implements OnInit {

 // lastTenDays: Day[];
  lastTenDays: Day[] = myDays;
  dataTableColumns = ['Jour', 'Début de journée', 'Début de déjeuner', 'Fin de déjeuner', 'Fin de journée'];
  constructor() { }

  ngOnInit() {
  }

}
