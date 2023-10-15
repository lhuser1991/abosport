import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AffichageClientAbonnementComponent } from './affichage-client-abonnement.component';

describe('AffichageClientAbonnementComponent', () => {
  let component: AffichageClientAbonnementComponent;
  let fixture: ComponentFixture<AffichageClientAbonnementComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AffichageClientAbonnementComponent]
    });
    fixture = TestBed.createComponent(AffichageClientAbonnementComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
