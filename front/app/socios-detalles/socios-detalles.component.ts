import  swal  from 'sweetalert2';
import { SocioService } from './../socio.service';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Socio } from '../socio';

@Component({
  selector: 'app-socio-detalles',
  templateUrl: './socios-detalles.component.html',
  styleUrls: ['./socios-detalles.component.css']
})
export class SociosDetallesComponent implements OnInit {

  id:number;
  socio:Socio;
  constructor(private route:ActivatedRoute,private socioServicio:SocioService) { }

  ngOnInit(): void {
    this.id = this.route.snapshot.params['id'];
    this.socio = new Socio();
    this.socioServicio.obtenerSocioPorId(this.id).subscribe(dato => {
      this.socio = dato;
      swal(`Detalles del socio ${this.socio.nombre}`);
    });
  }

}