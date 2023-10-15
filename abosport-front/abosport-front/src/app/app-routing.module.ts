import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AffichageClientComponent } from './affichage-client/affichage-client.component';
import { AffichageClientAbonnementComponent } from './affichage-client-abonnement/affichage-client-abonnement.component';

const routes: Routes = [
  {path: 'affichage-client', component: AffichageClientComponent},
  {path: 'affichage-client-abonnement/:id/listesport', component: AffichageClientAbonnementComponent},
  {path: '', redirectTo: 'affichage-client', pathMatch: 'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
