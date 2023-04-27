import { Component, OnInit } from '@angular/core';
import { Socio } from '../socio';
import { SocioService } from '../socio.service';
import { Router } from '@angular/router';
import swal from 'sweetalert2';

@Component({
  selector: 'app-list-socios',
  templateUrl: './list-socios.component.html',
})
export class ListSociosComponent implements OnInit {
  
  socios!:Socio[];

  constructor(private socioServicio:SocioService, private router:Router) { }

  ngOnInit(): void {
    this.obtenerSocios();
  }

  private obtenerSocios() {
    this.socioServicio.obtenerListaDeSocios().subscribe(dato => {
      this.socios = dato;
    })
  }

  actualizarSocio(id:number) {
    this.router.navigate(['actualizar-socio', id]);
  }

  verDetallesDelSocio(id:number){
    this.router.navigate(['socio-detalles',id]);
  }

  eliminarSocio(id:number){
    swal({
      title: '¿Estas seguro?',
      text: "Confirma si deseas eliminar al socio",
      type: 'warning',
      showCancelButton: true,
      confirmButtonColor: '#3085d6',
      cancelButtonColor: '#d33',
      confirmButtonText: 'Si , elimínalo',
      cancelButtonText: 'No, cancelar',
      confirmButtonClass: 'btn btn-success',
      cancelButtonClass: 'btn btn-danger',
      buttonsStyling: true
    }).then((result) => {
      if(result.value){
        this.socioServicio.eliminarSocio(id).subscribe(dato => {
          console.log(dato);
          this.obtenerSocios();
          swal(
            'Empleado eliminado',
            'El empleado ha sido eliminado con exito',
            'success'
          )
        })
      }
    })
  }
}
