import { Component, OnInit } from '@angular/core';
import { Client } from '../classes/client';
import { AffichageClientService } from '../service/affichage-client-service/affichage-client.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-affichage-client',
  templateUrl: './affichage-client.component.html',
  styleUrls: ['./affichage-client.component.css']
})
export class AffichageClientComponent implements OnInit {

  clientSelectione: Client = new Client();
  clients: Client[] = [];
  clientSelectioneStatus: boolean = false;

  constructor(private clientService: AffichageClientService, private router: Router) { }

  private getClients() {
    this.clientService.getAllClient().subscribe(data => {
      this.clients = data;
    })
  }

  // voirAbonnement(id: number) {
  //   this.clientSelectioneStatus = true;
  //   this.clientService.getClientById(id).subscribe(data1 => {
  //     this.clientSelectione = data1;
  //   });
  // }

  voirAbonnement(id: number) {
    this.clientSelectioneStatus = true;
    this.clientService.getClientById(id).subscribe(data1 => {
      this.router.navigate(['affichage-client', data1.id, 'listesport'], { state: { data1 }});
    });
  }

  ngOnInit(): void {
    this.getClients();
    this.clientSelectioneStatus = false;
  }

}
