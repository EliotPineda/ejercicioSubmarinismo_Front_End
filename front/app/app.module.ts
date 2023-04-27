import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ListSociosComponent } from './list-socios/list-socios.component';
import { HttpClientModule } from '@angular/common/http';
import { RegistrarSocioComponent } from './registrar-socio/registrar-socio.component';
import { FormsModule } from '@angular/forms';
import { ActualizarSocioComponent } from './actualizar-socio/actualizar-socio.component';
import { SociosDetallesComponent } from './socios-detalles/socios-detalles.component';

@NgModule({
  declarations: [
    AppComponent,
    ListSociosComponent,
    RegistrarSocioComponent,
    ActualizarSocioComponent,
    SociosDetallesComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
