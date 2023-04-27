import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SociosDetallesComponent } from './socios-detalles.component';

describe('SociosDetallesComponent', () => {
  let component: SociosDetallesComponent;
  let fixture: ComponentFixture<SociosDetallesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SociosDetallesComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SociosDetallesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
