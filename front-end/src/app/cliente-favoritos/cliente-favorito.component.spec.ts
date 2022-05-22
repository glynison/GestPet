import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ClienteFavoritoComponent } from './cliente-favorito.component';

describe('ClienteFavoritoComponent', () => {
  let component: ClienteFavoritoComponent;
  let fixture: ComponentFixture<ClienteFavoritoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ClienteFavoritoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ClienteFavoritoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
