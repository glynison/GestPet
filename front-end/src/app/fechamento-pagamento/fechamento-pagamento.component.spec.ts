import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FechamentoPagamentoComponent } from './fechamento-pagamento.component';

describe('FechamentoPagamentoComponent', () => {
  let component: FechamentoPagamentoComponent;
  let fixture: ComponentFixture<FechamentoPagamentoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FechamentoPagamentoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FechamentoPagamentoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
