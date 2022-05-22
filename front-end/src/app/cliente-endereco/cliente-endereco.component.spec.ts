import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ClienteEnderecoComponent } from './cliente-endereco.component';

describe('ClienteEnderecoComponent', () => {
  let component: ClienteEnderecoComponent;
  let fixture: ComponentFixture<ClienteEnderecoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ClienteEnderecoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ClienteEnderecoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
