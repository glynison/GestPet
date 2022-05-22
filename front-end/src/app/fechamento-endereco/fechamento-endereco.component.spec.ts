import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FachamentoEnderecoComponent } from './fechamento-endereco.component';

describe('FachamentoEnderecoComponent', () => {
  let component: FachamentoEnderecoComponent;
  let fixture: ComponentFixture<FachamentoEnderecoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FachamentoEnderecoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FachamentoEnderecoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
