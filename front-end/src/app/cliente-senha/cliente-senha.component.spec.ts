import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ClienteSenhaComponent } from './cliente-senha.component';

describe('ClienteSenhaComponent', () => {
  let component: ClienteSenhaComponent;
  let fixture: ComponentFixture<ClienteSenhaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ClienteSenhaComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ClienteSenhaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
