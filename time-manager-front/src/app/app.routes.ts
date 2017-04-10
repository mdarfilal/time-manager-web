import { DetailsComponent } from './details/details.component';
import { TodayComponent } from './today/today.component';
import {RouterModule, Routes} from '@angular/router';

const routes: Routes = [
    { path: '', redirectTo: 'today', pathMatch: 'full' },
    { path: 'today', component: TodayComponent },
    { path: 'details', component: DetailsComponent }
];

export const routing = RouterModule.forRoot(routes);
