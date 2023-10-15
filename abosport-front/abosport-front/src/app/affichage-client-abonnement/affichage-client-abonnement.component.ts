import { Component, OnInit, Input } from '@angular/core';
import { Client } from '../classes/client';
import { ActivatedRoute, Router } from '@angular/router';
import { MyState } from './interfaces/my-state.interface';

@Component({
  selector: 'app-affichage-client-abonnement',
  templateUrl: './affichage-client-abonnement.component.html',
  styleUrls: ['./affichage-client-abonnement.component.css']
})
export class AffichageClientAbonnementComponent implements OnInit{

  // @Input() client: Client = new Client();

  client: Client = new Client();
  id: number = 0;

  constructor(private route: ActivatedRoute, private router: Router) {
    this.id = this.route.snapshot.params['id'];
    this.client = this.route.snapshot.data['client'];
  }

  ngOnInit(): void {
      
  }
}
