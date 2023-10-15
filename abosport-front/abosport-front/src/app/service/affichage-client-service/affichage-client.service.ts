import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Injectable } from '@angular/core';
import { Client } from 'src/app/classes/client';

@Injectable({
  providedIn: 'root'
})
export class AffichageClientService {

  private baseUrl = 'http://localhost:8080/api/v1/abosport/personne';

  constructor(private httpClient: HttpClient) { }

  getAllClient() : Observable<Client[]> {
    return this.httpClient.get<Client[]>(`${this.baseUrl}`);
  }

  getClientById(id: number) : Observable<Client> {
    return this.httpClient.get<Client>(`${this.baseUrl}/${id}`);
  }
}
