import { Component, OnInit } from '@angular/core';
import { Socio } from '../socio';
import { SocioService } from '../socio.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-registrar-socio',
  templateUrl: './registrar-socio.component.html',
  styleUrls: ['./registrar-socio.component.css']
})
export class RegistrarSocioComponent implements OnInit {
  socio: Socio = new Socio();
  constructor(private socioServicio:SocioService, private router:Router) { }

  ngOnInit(): void {
    
  }
  
  guardarSocio() {
    this.socioServicio.registrarSocio(this.socio).subscribe(dato => {
      console.log(dato);
      this.irALaLista();
      
    }, error => console.log(error)); 
  }

  irALaLista() {
    this.router.navigate(['/socios']);
  }

  onSubmit() {
        
    this.guardarSocio();
  }

}
