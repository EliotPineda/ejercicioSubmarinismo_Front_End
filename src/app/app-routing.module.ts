import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ListSociosComponent } from './list-socios/list-socios.component';
import { RegistrarSocioComponent } from './registrar-socio/registrar-socio.component';
import { ActualizarSocioComponent } from './actualizar-socio/actualizar-socio.component';
import { SociosDetallesComponent } from './socios-detalles/socios-detalles.component';

const routes: Routes = [
  {path : 'socios', component:ListSociosComponent},
  {path : '', redirectTo: 'socios', pathMatch : 'full'},
  {path : 'registrar-socio', component: RegistrarSocioComponent},
  {path : 'actualizar-socio/:id',component : ActualizarSocioComponent},
  {path : 'socio-detalles/:id',component : SociosDetallesComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
