import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListSociosComponent } from './list-socios.component';

describe('ListSociosComponent', () => {
  let component: ListSociosComponent;
  let fixture: ComponentFixture<ListSociosComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListSociosComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ListSociosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
