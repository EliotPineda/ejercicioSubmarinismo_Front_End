import  swal  from 'sweetalert2';
import { SocioService } from './../socio.service';
import { Socio } from './../socio';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-actualizar-socio',
  templateUrl: './actualizar-socio.component.html',
  styleUrls: ['./actualizar-socio.component.css']
})
export class ActualizarSocioComponent implements OnInit {

  id:number;
  socio:Socio = new Socio();
  constructor(private socioService:SocioService,private router:Router,private route:ActivatedRoute) { }

  ngOnInit(): void {
    this.id = this.route.snapshot.params['id'];
    this.socioService.obtenerSocioPorId(this.id).subscribe(dato =>{
      this.socio = dato;
    },error => console.log(error));
  }

  irALaListaDeSocios(){
    this.router.navigate(['/socios']);
    swal('Socio actualizado',`El socio ${this.socio.nombre} ha sido actualizado con exito`,`success`);
  }

  onSubmit(){
    this.socioService.actualizarSocio(this.id,this.socio).subscribe(dato => {
      this.irALaListaDeSocios();
    },error => console.log(error));
  }
}