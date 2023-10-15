import { TestBed } from '@angular/core/testing';

import { AffichageClientAbonnementService } from './affichage-client-abonnement.service';

describe('AffichageClientAbonnementService', () => {
  let service: AffichageClientAbonnementService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AffichageClientAbonnementService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
