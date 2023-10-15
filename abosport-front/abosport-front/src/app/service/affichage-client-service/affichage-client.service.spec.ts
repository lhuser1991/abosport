import { TestBed } from '@angular/core/testing';

import { AffichageClientService } from './affichage-client.service';

describe('AffichageClientService', () => {
  let service: AffichageClientService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AffichageClientService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
